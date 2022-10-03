package com.walle.guide.proxy;

/**
 * @author a58
 */
public class DogTimeProxy implements Pet {
    private Pet pet;
    public DogTimeProxy(Pet pet) {
        this.pet = pet;
    }

    @Override
    public void play() {
        long startTs = System.currentTimeMillis();
        pet.play();
        System.out.println("spend time: " + (System.currentTimeMillis() - startTs));
    }
}
