package com.walle.guide.facade;

public class PetMaker {
    private Pet dog;
    private Cat cat;

    public PetMaker() {
        dog = new Dog();
        cat = new Cat();
    }

    public void eatDog() {
        dog.eat();
    }

    public void eatCat() {
        cat.eat();
    }
}
