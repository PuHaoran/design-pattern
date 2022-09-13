package com.walle.guide.factory;

public class PetFactory {
    public Pet getPet(String petType) {
        if (petType == null) {
            return null;
        }
        else if (petType.equalsIgnoreCase("DOG")) {
            return new Dog();
        }
        else if (petType.equalsIgnoreCase("CAT")) {
            return new Cat();
        }
        return null;
    }
}
