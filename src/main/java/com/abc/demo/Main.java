package com.abc.demo;

public class Main {

    public static void main(String[] args) {

        Tiger tiger = new Tiger(new Eating(), new Walking());
        tiger.eat();
        tiger.walk();

        Penguin penguin = new Penguin(new Eating(), new Walking());
        penguin.eat();
        penguin.walk();

        Eagle eagle = new Eagle(new Eating(), new Flying());
        eagle.eat();
        eagle.fly();

        Unicorn unicorn = new Unicorn(new Eating(), new Flying(), new Walking());
        unicorn.eat();
        unicorn.walk();
        unicorn.fly();

    }
}
