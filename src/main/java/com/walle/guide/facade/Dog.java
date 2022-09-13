package com.walle.guide.facade;

public class Dog implements Pet {
    @Override
    public void eat() {
        System.out.println("dog eat bone.");
    }
}
