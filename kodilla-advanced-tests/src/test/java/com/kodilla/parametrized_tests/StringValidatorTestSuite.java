package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTestSuite {
    private StringValidator validator = new StringValidator();
    static int count = 1;

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"", "      "})
    public void shouldReturnTrueIfStringIsEmpty(String text) {
        assertTrue(validator.isBlank(text));
    }
}