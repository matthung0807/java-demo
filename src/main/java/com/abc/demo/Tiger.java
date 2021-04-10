package com.abc.demo;

public class Tiger extends Animal implements Walkable {

    private Walk walk;

    public Tiger(Eat eat, Walk walk) {
        super("Tiger", eat);
        this.walk = walk;
    }

    public void walk() {
        walk.walk(name);
    }
}
