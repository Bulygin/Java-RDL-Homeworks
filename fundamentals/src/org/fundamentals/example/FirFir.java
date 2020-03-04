package org.fundamentals.example;

public interface Functional extends Voice {
    @Override
    default String voice() {
        return "FirFir";
    }
}
