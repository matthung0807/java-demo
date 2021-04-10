package com.abc.demo;

public class Flying implements Fly {
    @Override
    public void fly(String name) {
        System.out.println(name + " fly");
    }
}
