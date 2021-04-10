package com.abc.demo;

public class Penguin extends Animal implements Walkable {

    private Walk walk;

    public Penguin(Eat eat, Walk walk) {
        super("Penguin", eat);
        this.walk = walk;
    }

    @Override
    public void walk() {
        walk.walk(name);
    }
}
