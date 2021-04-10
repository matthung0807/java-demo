package com.abc.demo.animal;

import com.abc.demo.ability.Eat;
import com.abc.demo.ability.Walk;
import com.abc.demo.feature.Eatable;
import com.abc.demo.feature.Walkable;

public class Penguin extends Animal implements Eatable, Walkable {

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
