package com.walle.guide.facade;

public class PetMaker {
    private Pet dog;
    private Cat cat;

    public PetMaker() {
        dog = new Dog();
        cat = new Cat();
    }

    public void behaviorDog() {
        dog.behavior();
    }

    public void behaviorCat() {
        cat.behavior();
    }
}
