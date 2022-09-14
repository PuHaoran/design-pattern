package com.walle.guide.facade;

public class Dog implements Pet {
    @Override
    public void behavior() {
        System.out.println("dog eat bone, wang wang.");
    }
}
