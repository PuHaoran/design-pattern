package com.walle.guide.composite;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private Integer age;

    private List<Person> childrenList = new ArrayList<>();

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void addChildren(Person person) {
        this.childrenList.add(person);
    }

    public List<Person> getChildrenList() {
        return this.childrenList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", childrenList=" + childrenList +
                '}';
    }
}
