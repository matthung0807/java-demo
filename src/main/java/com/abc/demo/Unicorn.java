package com.abc.demo;

public class Unicorn extends Animal implements Flyable, Walkable{

    public Unicorn() {
        this.name = "Unicorn";
    }

    @Override
    public void fly() {
        System.out.println(this.name + " fly");
    }

    @Override
    public void walk() {
        System.out.println(this.name + " walk");
    }
}
