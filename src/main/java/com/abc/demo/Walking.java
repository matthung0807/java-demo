package com.abc.demo;

public class Walking implements Walk {

    @Override
    public void walk(String name) {
        System.out.println(name + " walk");
    }
}
