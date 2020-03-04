package org.fundamentals.example;

public class Hedgehog extends Pet implements TakesRings, FirFir {
    @Override
    protected String getName() {
        return "Hedgehog";
    }
}
