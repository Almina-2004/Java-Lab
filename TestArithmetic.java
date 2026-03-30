import Arithmetic.*;

import java.util.Scanner;

public class TestArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Create objects for each operation
        Operation add = new Addition();
        Operation sub = new Subtraction();
        Operation mul = new Multiplication();
        Operation div = new Division();

        // Perform operations
        System.out.println("Addition: " + add.calculate(num1, num2));
        System.out.println("Subtraction: " + sub.calculate(num1, num2));
        System.out.println("Multiplication: " + mul.calculate(num1, num2));
        try {
            System.out.println("Division: " + div.calculate(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Division: " + e.getMessage());
        }

        sc.close();
    }
}