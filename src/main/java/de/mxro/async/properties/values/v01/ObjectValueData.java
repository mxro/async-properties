package de.mxro.async.properties.values.v01;

import java.io.Serializable;

public class ObjectValueData implements Serializable {

    private static final long serialVersionUID = 1L;

    public Object value;

    public Object value() {
        return value;
    }

    @SuppressWarnings("unchecked")
    public <T> T value(final Class<T> ofType) {
        return (T) value;
    }

    public ObjectValueData() {
        super();
    }

}