package com.abc.passwordvalidator.properties;

import com.abc.passwordvalidator.rule.character.Character;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class PasswordValidationPropertiesTests {

    @Test
    public void getCharacterSet_empty() {
        Set<Character> characterSet = PasswordValidationProperties.getCharacterSet();
        Assertions.assertTrue(characterSet.isEmpty());
    }

}
