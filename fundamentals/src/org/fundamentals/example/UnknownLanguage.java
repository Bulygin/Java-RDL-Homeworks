package org.fundamentals.example;

public class UnknownPet extends Pet {

    private String name;

    UnknownPet(String name) {
        this.name = name;
    }

    @Override
    protected String getName() {
        return name;
    }

    @Override
    public String specification() {
        return "unknown";
    }

    @Override
    public String type() {
        return "unclear";
    }
}
