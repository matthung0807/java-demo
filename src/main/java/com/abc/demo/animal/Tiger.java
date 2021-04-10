package com.abc.demo.animal;

import com.abc.demo.ability.Eat;
import com.abc.demo.ability.Walk;
import com.abc.demo.feature.Walkable;

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
