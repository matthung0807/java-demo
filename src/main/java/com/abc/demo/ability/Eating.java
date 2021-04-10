package com.abc.demo.ability;

public class Eating implements Eat {

    @Override
    public void eat(String name) {
        System.out.println(name + " eat");
    }

}
