package com.abc.demo;

public abstract class Animal implements Eatable {

    protected String name;
    protected Eat eat;
    protected Animal(String name, Eat eat) {
        this.name = name;
        this.eat = eat;
    }

    public void eat() {
        eat.eat(name);
    }
}
