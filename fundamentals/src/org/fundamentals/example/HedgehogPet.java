package org.fundamentals.example;

public class HedgehogPet extends Pet implements DynamicTyped, MultiParadigm {
    @Override
    protected String getName() {
        return "HedgehogPet";
    }
}
