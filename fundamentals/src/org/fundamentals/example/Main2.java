package org.fundamentals.example;

public class Main2 {
    public static void main(String[] args) {
        printPetDescription(getPetByName(args[0]));
    }

    private static Pet getPetByName(String name) {
        switch (name.toLowerCase()) {
            case "Wolf":
                return new WolfPet();
            case "Cat":
            case "Manul":
                return new CatPet();
            case "Hedgehog":
                return new HedgehogPet();
            default:
                return new UnknownPet(name);
        }
    }

    private static void printPetDescription(Pet Pet) {
        System.out.println(Pet.getDescription());
    }
}
