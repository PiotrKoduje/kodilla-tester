package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DoubleSource {
    static Stream<Arguments> provideDoubleForTestingBMI(){
        return  Stream.of(
                Arguments.of(1.8,48,"Very severely underweight"),
                Arguments.of(1.78,50,"Severely underweight"),
                Arguments.of(1.68,65,"Normal (healthy weight)"),
                Arguments.of(1.64,78,"Overweight"),
                Arguments.of(1.58,85,"Obese Class I (Moderately obese)"),
                Arguments.of(1.55,94,"Obese Class II (Severely obese)"),
                Arguments.of(1.6,115,"Obese Class III (Very severely obese)"),
                Arguments.of(1.65,135,"Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.7,170,"Obese Class V (Super Obese)"),
                Arguments.of(1.72,180,"Obese Class VI (Hyper Obese)")
        );
    }
}
