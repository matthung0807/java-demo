package com.abc.demo.animal;

import com.abc.demo.ability.Eat;
import com.abc.demo.ability.Fly;
import com.abc.demo.feature.Flyable;

public class Eagle extends Animal implements Flyable {

    private Fly fly;

    public Eagle(Eat eat, Fly fly) {
        super("Eagle", eat);
        this.fly = fly;
    }

    @Override
    public void fly() {
        fly.fly(name);
    }
}
