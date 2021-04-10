package com.abc.demo.animal;

import com.abc.demo.ability.Eat;
import com.abc.demo.ability.Fly;
import com.abc.demo.ability.Walk;
import com.abc.demo.feature.Flyable;
import com.abc.demo.feature.Walkable;

public class Unicorn extends Animal implements Flyable, Walkable {

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
