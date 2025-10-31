package com.example;

public class Greeting {
    public String sayHello(String name) {
        if (name == null) {
            return "Hello, Friend";
        }
        if (name.trim().isEmpty()) {
            return "Hello, World";
        }
        return "Hello, " + name;
    }
}
