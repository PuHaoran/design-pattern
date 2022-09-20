package com.walle.guide.abstractFactory;

public abstract class AbstractFactory {
    public abstract Pet getPet(String petType);
    public abstract Toy getToy(String toyType);
}
