package com.kodilla.stream;

public class AsciiConverter {
    public static String stringToAscii(String inputString) {
        StringBuilder asciiBuilder = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            int asciiValue = (int) character;
            asciiBuilder.append(asciiValue).append(" ");
        }

        return asciiBuilder.toString();
    }

    public static void main(String[] args) {
        String inputString = "Atak na bazę przeciwnika o godzinie 16";
        String asciiCode = stringToAscii(inputString);
        System.out.println("ASCII code: " + asciiCode);
    }
}