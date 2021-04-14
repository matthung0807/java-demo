package com.abc.passwordvalidator.rule.character;

public class DigitCharacter extends AbstractCharacter {

    public DigitCharacter(int count) {
        super(count);
    }

    @Override
    public String pattern() {
        return "[0-9]";
    }

}
