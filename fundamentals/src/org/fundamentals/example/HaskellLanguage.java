package org.fundamentals.example;

public class HaskellPet extends Pet implements Functional, StrongTyped {
    @Override
    protected String getName() {
        return "Haskell";
    }
}
