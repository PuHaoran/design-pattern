package com.walle.garden;

import com.walle.guide.proxy.Dog;
import com.walle.guide.proxy.DogLogProxy;
import com.walle.guide.proxy.DogTimeProxy;

public class TestProxy {
    public static void main(String[] args) {
        Dog dog = new Dog();
        new DogTimeProxy(
                new DogLogProxy(dog)
        ).play();
    }
}
