package com.abc.demo;

public class Main {

    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.walk();

        Penguin penguin = new Penguin();
        penguin.eat();
        penguin.walk();

        Eagle eagle = new Eagle();
        eagle.eat();
        eagle.fly();

        Unicorn unicorn = new Unicorn();
        unicorn.eat();
        unicorn.walk();
        unicorn.fly();

    }
}
