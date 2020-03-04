package org.fundamentals.example;

public class Unknown extends Pet {

    private String name;

    UnknownPet(String name) {
        this.name = name;
    }

    @Override
    protected String getName() {
        return name;
    }

    @Override
    public String voice() {
        return "unknown";
    }

    @Override
    public String action() {
        return "unclear";
    }
}
