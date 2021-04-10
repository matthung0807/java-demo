package com.abc.demo;

public abstract class Animal implements Eatable {

    protected String name;

    public void eat() {
        System.out.println(name + " eat");
    }
}
