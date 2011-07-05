package com.bia.csvvalidator;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Intesar Mohammed
 *  
 *  Represents type of the field 
 */
public enum Type {

    NUMBER("n"), TEXT("t"), DATE("d");
    
    private String code;

    private Type(String code) {
        this.code = code;
    }
    private static final Map<String, Type> lookup =
            new HashMap<String, Type>();

    /**
     * Stores all Enum's into lookup
     */
    static {
        for (Type s : EnumSet.allOf(Type.class)) {
            lookup.put(s.code, s);
        }
    }

    public static Type get(String code) {
        code = code.toLowerCase();
        return lookup.get(code);
    }
}
