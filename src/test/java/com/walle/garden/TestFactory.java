package com.walle.garden;

import com.walle.guide.factory.Pet;
import com.walle.guide.factory.PetFactory;

public class TestFactory {
    public static void main(String[] args) {
        PetFactory petFactory = new PetFactory();
        Pet pet = petFactory.getPet("Dog");
        pet.eat();
    }
}
