package org.fundamentals.example;

public class Unknown extends Pet {

    private String name;

    Unknown(String name) {
        this.name = name;
    }

    @Override
    protected String getName() {
        return name;
    }

    @Override
    public String voice() {
        return "who i am?";
    }

    @Override
    public String action() {
        return "simply exist";
    }
}
