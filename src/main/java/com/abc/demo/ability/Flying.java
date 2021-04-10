package com.abc.demo.ability;

public class Flying implements Fly {

    @Override
    public void fly(String name) {
        System.out.println(name + " fly");
    }

}
