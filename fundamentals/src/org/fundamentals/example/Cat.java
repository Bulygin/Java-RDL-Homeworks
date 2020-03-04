package org.fundamentals.example;

public class Cat extends Pet implements Sleep, Meow {
    @Override
    protected String getName() {
        return "Cat";
    }
}
