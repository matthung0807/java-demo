package com.abc.passwordvalidator.rule.character;

public class LowercaseCharacter extends AbstractCharacter {

    public LowercaseCharacter(int count) {
        super(count);
    }

    @Override
    protected String pattern() {
        return "[a-z]";
    }

}
