package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"aaa", "BBB", "123", "...", "___", "---", "aB4", "_-.", "aaB4.", ".nickName97"})
    public void shouldReturnTrueIfUsernameMatchesTheRegex(String username){
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"aa", "BB?", "12,", "*Ala*", "_", "--", "nick$", "_-;", ".,.", ".nickName@"})
    public void shouldReturnFalseIfUsernameDoesntMatchTheRegex(String username){
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"a.B@c.d.comcom", "bbC4@radio.voice", "7BTC@coin.coin.coin.coin.coin", "play.women.star@callME.x", ""})
    public void shouldReturnTrueIfEmailMatchesTheRegex(String email){
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"a.B@c.d.comcome", "$C4@radio.voice", "7BTC@co2.co2.co2.co2.co2.co2.co2.co2", "pl@y.women.star@callME.x", "błąd@gęśla.jaźń", "email.address.gmail.com", "4he.winn3r@", "@4akes.it.a11"})
    public void shouldReturnFalseIfEmailDoesntMatchTheRegex(String email){
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }
}

/*
^([_a-zA-Z0-9-]+(\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\.[a-zA-Z0-9-]+)*(\.[a-zA-Z]{1,6}))?$
([_a-zA-Z0-9-]+
(\.[_a-zA-Z0-9-]+)*
@
[a-zA-Z0-9-]+
(\.[a-zA-Z0-9-]+)*
(\.[a-zA-Z]{1,6})
*/
