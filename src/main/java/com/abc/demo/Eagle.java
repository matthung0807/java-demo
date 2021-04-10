package com.abc.demo;

public class Eagle extends Animal implements Flyable {

    public Eagle() {
        this.name = "Eagle";
    }

    @Override
    public void fly() {
        System.out.println(this.name + " fly");
    }
}
