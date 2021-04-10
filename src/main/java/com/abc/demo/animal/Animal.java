package com.abc.demo.animal;

import com.abc.demo.ability.Eat;
import com.abc.demo.feature.Eatable;

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
