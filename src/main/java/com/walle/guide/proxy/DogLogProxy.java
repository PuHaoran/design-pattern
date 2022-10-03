package com.walle.guide.proxy;

public class DogLogProxy implements Pet{
    private Pet pet;
    public DogLogProxy(Pet pet) {
        this.pet = pet;
    }
    @Override
    public void play() {
        System.out.println("log start...");
        pet.play();
        System.out.println("log end...");
    }
}
