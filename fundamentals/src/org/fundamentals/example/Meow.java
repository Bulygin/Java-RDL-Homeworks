package org.fundamentals.example;

public interface Meow extends Voice {
    @Override
    default String voice() {
        return "MEOW";
    }
}
