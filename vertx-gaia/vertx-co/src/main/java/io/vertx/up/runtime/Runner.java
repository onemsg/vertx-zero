package io.vertx.up.runtime;

import io.aeon.runtime.MeanThread;
import io.horizon.uca.log.Annal;
import io.vertx.up.fn.Fn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Consumer;

/**
 * Multi thread helper tool to do some multi-thread works.
 */
public final class Runner {

    private static final Annal LOGGER = Annal.get(Runner.class);

    // Execute single thread
    public static Thread run(final Runnable hooker,
                             final String name) {
        final Thread thread = new Thread(hooker);
        // Append Thread id
        thread.setName(name + "-" + thread.getId());
        thread.start();
        return thread;
    }

    // Execute multi thread
    public static void run(final String name, final Runnable... hookers) {
        final List<Thread> threads = new ArrayList<>();
        for (int idx = 0; idx < hookers.length; idx++) {
            final String threadName = name + "-" + idx;
            final Runnable hooker = hookers[idx];
            threads.add(run(hooker, threadName));
        }
        Fn.jvmAt(() -> {
            for (final Thread thread : threads) {
                thread.join();
            }
        });
    }

    public static <T> void run(final Set<T> inputSet, final Consumer<T> consumer) {
        final Set<Thread> threads = new HashSet<>();
        inputSet.forEach(item -> {
            final Thread thread = new Thread(() -> consumer.accept(item));
            thread.start();
            threads.add(thread);
        });
        Fn.jvmAt(() -> {
            for (final Thread thread : threads) {
                thread.join();
            }
        });
    }

    public static <T> void run(final List<MeanThread<T>> meanThreads,
                               final ConcurrentMap<String, T> result) {
        final List<Thread> references = new ArrayList<>();
        for (final MeanThread<T> meanThread : meanThreads) {
            final Thread thread = new Thread(meanThread);
            references.add(thread);
            thread.start();
        }
        references.forEach(item -> {
            try {
                item.join();
            } catch (final InterruptedException ex) {
                LOGGER.fatal(ex);
            }
        });
        for (final MeanThread<T> meanThread : meanThreads) {
            final String key = meanThread.getKey();
            final T value = meanThread.get();
            Fn.runAt(() -> {
                result.put(key, value);
            }, key, value);
        }
    }
}
