package com.walle.guide.facade;

public class Cat implements Pet {
    @Override
    public void eat() {
        System.out.println("cat eat fish.");
    }
}
