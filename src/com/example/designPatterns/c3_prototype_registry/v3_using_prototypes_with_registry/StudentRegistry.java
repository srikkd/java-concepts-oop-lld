package com.example.designPatterns.c3_prototype_registry.v3_using_prototypes_with_registry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> map = new HashMap<>();

    void register(String key, Student student){
        map.put(key, student);
    }

    Student getPrototype(String key){
        return map.get(key).clone();
    }
}
