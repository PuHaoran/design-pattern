package com.walle.guide.facade;

public class Cat implements Pet {
    @Override
    public void behavior() {
        System.out.println("cat eat fish, miao miao.");
    }
}
