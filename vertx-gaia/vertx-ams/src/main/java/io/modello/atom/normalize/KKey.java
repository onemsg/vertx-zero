package io.modello.atom.normalize;

import io.horizon.util.HUt;
import io.modello.eon.em.KeyType;
import io.modello.specification.element.HKey;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * HKey 的默认实现，您可以直接从此类继承定义自己的 HKey 相关信息
 * 有此默认实现，可直接省略部分自定义代码，该实现保证在任何无框架的JVM
 * 场景下可以使用。主要用于描述键相关信息：
 * <pre><code>
 *     1. 主键
 *     2. 唯一键
 *     3. 外键
 * </code></pre>
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class KKey implements HKey {
    private final Set<String> fields = new HashSet<>();
    private final KeyType type;

    private KKey(final KeyType type) {
        this.type = Objects.isNull(type) ? KeyType.UNIQUE : type;
    }

    public static KKey of(final KeyType type) {
        return new KKey(type);
    }

    @Override
    public KeyType type() {
        return this.type;
    }

    @Override
    public String key() {
        return this.fields.isEmpty() ? null :
            this.fields.iterator().next();
    }

    @Override
    public HKey key(final String key) {
        // 清空
        this.fields.clear();
        if (HUt.isNotNil(key)) {
            this.fields.add(key);
        }
        return this;
    }

    @Override
    public HKey key(final Set<String> keys) {
        // 清空
        this.fields.clear();
        if (Objects.nonNull(keys) && !keys.isEmpty()) {
            this.fields.addAll(keys);
        }
        return this;
    }

    @Override
    public Set<String> keys() {
        return this.fields;
    }
}
