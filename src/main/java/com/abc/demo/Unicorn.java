package com.abc.demo;

public class Unicorn extends Animal implements Flyable, Walkable{

    private Fly fly;
    private Walk walk;

    public Unicorn(Eat eat, Fly fly, Walk walk) {
        super("Unicorn", eat);
        this.fly = fly;
        this.walk = walk;
    }

    @Override
    public void fly() {
        fly.fly(name);
    }

    @Override
    public void walk() {
        walk.walk(name);
    }
}
