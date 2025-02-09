// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zero.enum.proto

package io.vertx.tp.ipc.eon.em;

/**
 * <pre>
 * Envelop Category
 * </pre>
 *
 * Protobuf enum {@code io.vertx.tp.ipc.eon.em.Category}
 */
public enum Category
    implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Compression
     * </pre>
     *
     * <code>COMPRESSABLE = 0;</code>
     */
    COMPRESSABLE(0),
    /**
     * <pre>
     * Uncompression
     * </pre>
     *
     * <code>UNCOMPRESSABLE = 1;</code>
     */
    UNCOMPRESSABLE(1),
    /**
     * <pre>
     * Random
     * </pre>
     *
     * <code>RANDOM = 2;</code>
     */
    RANDOM(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Compression
     * </pre>
     *
     * <code>COMPRESSABLE = 0;</code>
     */
    public static final int COMPRESSABLE_VALUE = 0;
    /**
     * <pre>
     * Uncompression
     * </pre>
     *
     * <code>UNCOMPRESSABLE = 1;</code>
     */
    public static final int UNCOMPRESSABLE_VALUE = 1;
    /**
     * <pre>
     * Random
     * </pre>
     *
     * <code>RANDOM = 2;</code>
     */
    public static final int RANDOM_VALUE = 2;


    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new java.lang.IllegalArgumentException(
                "Can't get the number of an unknown enum value.");
        }
        return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Category valueOf(int value) {
        return forNumber(value);
    }

    public static Category forNumber(int value) {
        switch (value) {
            case 0:
                return COMPRESSABLE;
            case 1:
                return UNCOMPRESSABLE;
            case 2:
                return RANDOM;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Category>
    internalGetValueMap() {
        return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<
        Category> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Category>() {
            public Category findValueByNumber(int number) {
                return Category.forNumber(number);
            }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
    getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor
    getDescriptorForType() {
        return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor
    getDescriptor() {
        return io.vertx.tp.ipc.eon.em.UpEnum.getDescriptor().getEnumTypes().get(2);
    }

    private static final Category[] VALUES = values();

    public static Category valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
                "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
            return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
    }

    private final int value;

    private Category(int value) {
        this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:io.vertx.tp.ipc.eon.em.Category)
}

