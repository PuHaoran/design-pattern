package com.walle.guide.abstractFactory;

public class PetFactory extends AbstractFactory{

    @Override
    public Pet getPet(String petType) {
        if (petType == null) {
            return null;
        }
        if (petType.equalsIgnoreCase("CAT")) {
            return new Cat();
        }
        return null;
    }

    @Override
    public Toy getToy(String toyType) {
        return null;
    }
}
