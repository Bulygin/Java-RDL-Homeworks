package org.fundamentals.example;

public class CatPet extends Pet implements DynamicTyped, MultiParadigm {
    @Override
    protected String getName() {
        return "Cat";
    }
}
