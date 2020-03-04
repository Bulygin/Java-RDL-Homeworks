package org.fundamentals.example;

public class PythonPet extends Pet implements DynamicTyped, MultiParadigm {
    @Override
    protected String getName() {
        return "PythonPet";
    }
}
