package com.walle.guide.flyweight;

import java.util.LinkedList;

public class ToyPool {
    public static class Toy {
        public String name;
        public boolean isBroken;
        public Toy(String name) {
            this.name = name;
            this.isBroken = false;
        }
    }
    private final LinkedList<Toy> toyList = new LinkedList<>();

    public ToyPool() {
        for (int i = 0; i < 5; i++) {
            toyList.add(new Toy("Toy"+i));
        }
    }
    public Toy getToy() {
        Toy toy = null;
        while (toyList.size() > 0) {
            toy = toyList.remove();
            if (!toy.isBroken) {
                break;
            }
        }
        if (toy != null && !toy.isBroken) {
            return toy;
        } else {
            return new Toy("ToyNew");
        }
    }
}
