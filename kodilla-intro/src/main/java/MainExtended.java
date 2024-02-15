public class MainExtended {
    public static void main(String[] args) {
        //Integers
        byte smallInt = 127;
        short mediumInt = 32_000;
        int normalInt = 50_000;
        long bigInt = 100_000_000L;

        //Floating point numbers
        float pi = 3.1415F;
        double bigFloat = 7e+12;

        //Character data
        char sign = '+';

        //Logical type
        boolean isntSheLovely = true;

        //Text data
        String confession = "I love my Peach";

        //Void
        MainExtended empty = new MainExtended();
        empty = null;

        System.out.println("\nSimpe types of variables in Java:");
        System.out.println("Int --> " + normalInt);
        System.out.println("Double --> " + bigFloat);
        System.out.println("Character --> " + sign);
        System.out.println("Logical --> " + isntSheLovely);
        System.out.println("Text --> " + confession + " :*");
        System.out.println("Void --> " + empty);
    }
}
