package com.walle.guide.abstractFactory;

public class ToyFactory extends AbstractFactory{
    @Override
    public Pet getPet(String petType) {
        return null;
    }

    @Override
    public Toy getToy(String toyType) {
        if (toyType == null) {
            return null;
        }
        if (toyType.equalsIgnoreCase("TANK")) {
            return new Tank();
        }
        return null;
    }
}
