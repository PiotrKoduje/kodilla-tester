package com.kodilla.parametrized_tests;

public class StringManipulator {
    String reverseWithLowerCase(String input){
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString().toLowerCase();
    }

    public int getStringLengthWithoutSpaces(String input) {
        String value = input.replaceAll(" ", "");
        return value.length();
    }

    public int countNumberOfCommas(String text) {
        int count = text.length() - text.replace(",", "").length();
        return count;
    }

    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        System.out.println(manipulator.countNumberOfCommas("dup,a,aaaa,"));
    }
}
