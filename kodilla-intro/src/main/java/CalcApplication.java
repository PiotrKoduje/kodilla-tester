public class CalcApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double area = calculator.circleArea(10);
        System.out.println("Area od the Circle with radius 10 equals " + area);

        double p = Calculator.PI;
        System.out.println("The value of a pi constant is equal to " + p);

        System.out.println(calculator.counter);

        Calculator calculator2 = new Calculator();
        System.out.println(calculator2.counter);
    }
}
