package org.fundamentals.example;

public interface TakesRings extends Action {
    @Override
    default String action() {
        return "Hedgehog runs around and collects rings";
    }
}
