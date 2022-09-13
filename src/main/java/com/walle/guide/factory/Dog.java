package com.walle.guide.factory;

/**
 * @author a58
 */
public class Dog implements Pet{
    @Override
    public void eat() {
        System.out.println("dog eat bone.");
    }
}
