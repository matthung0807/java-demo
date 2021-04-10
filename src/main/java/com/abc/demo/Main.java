package com.abc.demo;

import com.abc.demo.ability.Eating;
import com.abc.demo.ability.Flying;
import com.abc.demo.ability.Walking;
import com.abc.demo.animal.Eagle;
import com.abc.demo.animal.Penguin;
import com.abc.demo.animal.Tiger;
import com.abc.demo.animal.Unicorn;

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
