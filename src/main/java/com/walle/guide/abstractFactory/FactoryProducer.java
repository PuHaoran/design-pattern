package com.walle.guide.abstractFactory;

/**
 * chuang
 * @author a58
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("PET")) {
            return new PetFactory();
        } else if (choice.equalsIgnoreCase("TOY")) {
            return new ToyFactory();
        }
        return null;
    }
}
