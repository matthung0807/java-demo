package com.abc.demo;

public class Tiger extends Animal implements Walkable {

    public Tiger() {
        this.name = "Tiger";
    }

    public void walk() {
        System.out.println(this.name + " walk");
    }
}
