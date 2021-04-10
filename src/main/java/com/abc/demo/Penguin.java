package com.abc.demo;

public class Penguin extends Animal implements Walkable {

    public Penguin() {
        this.name = "Penguin";
    }

    @Override
    public void walk() {
        System.out.println(name + " walk");
    }
}
