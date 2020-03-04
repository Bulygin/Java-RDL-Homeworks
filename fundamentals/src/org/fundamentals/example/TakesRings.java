package org.fundamentals.example;

public interface TakesRings extends Action {
    @Override
    default String action() {
        return "runs around and takes rings";
    }
}
