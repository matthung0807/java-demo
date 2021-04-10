package com.abc.demo;

public class Eagle extends Animal implements Flyable {

    private Fly fly;

    public Eagle(Eat eat, Fly fly) {
        super("Eagle", eat);
        this.fly = fly;
    }

    @Override
    public void fly() {
        fly.fly(name);
    }
}
