package itmo.lab2;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.Sum(56.1, 98.5));
        System.out.println(calc.Divide(14000000, 100));
        System.out.println(calc.Multiply(12, 56));
        System.out.println(calc.Subtract(560, 160));

    }
}
