package com.walle.garden;

import com.walle.guide.abstractFactory.AbstractFactory;
import com.walle.guide.abstractFactory.FactoryProducer;
import com.walle.guide.abstractFactory.Pet;
import com.walle.guide.abstractFactory.Toy;

public class TestAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory petFactory = FactoryProducer.getFactory("PET");
        Pet cat = petFactory.getPet("CAT");
        cat.eat();

        AbstractFactory toyFactory = FactoryProducer.getFactory("TOY");
        Toy toy = toyFactory.getToy("TANK");
        toy.makeSound();
    }
}
