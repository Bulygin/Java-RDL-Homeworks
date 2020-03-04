package org.fundamentals.example;

public class Main2 {
    public static void main(String[] args) {
        printPetDescription(getPetByName(args[0]));
    }

    private static Pet getPetByName(String name) {
        switch (name.toLowerCase()) {
            case "wolf":
                return new Wolf();
            case "cat":
            case "manul":
                return new Cat();
            case "hedgehog":
                return new Hedgehog();
            default:
                return new Unknown(name);
        }
    }

    private static void printPetDescription(Pet Pet) {
        System.out.println(Pet.getDescription());
    }
}
