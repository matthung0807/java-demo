package com.abc.demo;

public class Eating implements Eat {
    @Override
    public void eat(String name) {
        System.out.println(name + " eat");
    }
}
