package org.fundamentals.example;

public interface Sleep extends Action {
    @Override
    default String action() {
        return "just sleeps all day";
    }
}
