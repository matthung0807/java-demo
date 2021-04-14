package com.abc.passwordvalidator;

import com.abc.passwordvalidator.rule.Rule;

public interface PasswordValidationService {
    boolean isValid(String password, Rule... rules);
}
