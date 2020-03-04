package org.fundamentals.example;

public abstract class Pet implements Voice, Action {
    protected abstract String getName();

    String getDescription() {
        return getName() + " says "+ voice() + " and "  + action();
    }
}
