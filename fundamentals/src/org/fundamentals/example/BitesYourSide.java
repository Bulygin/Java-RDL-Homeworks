package org.fundamentals.example;

public interface BitesYourSide extends Action {
    @Override
    default String action() {
        return "Bites your side";
    }
}
