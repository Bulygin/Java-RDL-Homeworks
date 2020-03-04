package org.fundamentals.example;

public interface FirFir extends Voice {
    @Override
    default String voice() {
        return "Fir-Fir";
    }
}
