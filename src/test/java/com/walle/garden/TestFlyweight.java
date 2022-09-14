package com.walle.garden;

import com.walle.guide.flyweight.ToyPool;

public class TestFlyweight {
    public static void main(String[] args) {
        ToyPool toyPool = new ToyPool();
        for (int i = 0; i < 10; i++) {
            ToyPool.Toy toy = toyPool.getToy();
            System.out.println(toy.name);
        }
    }
}
