package io.openexchange.schema.api.model;

import java.util.function.Predicate;

import static java.util.Objects.requireNonNull;

public class Schema {

    public enum Type {
        XSD, JSON, AVRO
    }

    private final String content;
    private final String id;
    private final Type type;
    private final int version;

    public Schema(String content, String id, int version, Type type) {
        this.content = requireNonNull(content, "Schema content must not be null");
        this.id = requireNonNull(id, "Schema id must not be null");
        this.version = matches(version, i -> i >= 1, new IllegalArgumentException("Schema version must not be lower than 1"));
        this.type = requireNonNull(type, "Schema type must not be null");
    }

    public Schema(String content, String id, int version) {
        this(content, id, version, Type.XSD);
    }

    public Schema(String content, String id) {
        this(content, id, 1, Type.XSD);
    }

    public String getContent() {
        return content;
    }

    public String getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public int getVersion() {
        return version;
    }

    private static <V> V matches(V v, Predicate<V> p, RuntimeException t) throws RuntimeException {
        if(p.test(v)) return v;
        throw t;
    }
}
