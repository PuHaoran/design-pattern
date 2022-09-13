package com.walle.garden;

import com.walle.guide.composite.Person;

import java.util.List;

public class TestComposite {
    public static void main(String[] args) {
        Person grandFather = new Person("grandFather", 80);
        Person father = new Person("father", 50);
        Person mother = new Person("mother", 48);
        grandFather.addChildren(father);
        grandFather.addChildren(mother);
        List<Person> childrenList = grandFather.getChildrenList();
        for (int i = 0; i < childrenList.size(); i++) {
            System.out.println(childrenList.get(i));
        }
    }
}
