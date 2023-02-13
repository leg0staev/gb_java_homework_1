package hw;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("===== task 3 ======");
        System.out.println("==  simple calc  ==");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double firstnumber = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double secondNumber = scanner.nextDouble();

            System.out.print("Enter mathematical operation (+ - * /): ");
            String action = scanner.next();

            switch (action) {
                case "+":
                    System.out.println("result = " + Addition(firstnumber, secondNumber));
                    break;
                case "-":
                    System.out.println("result = " + Subtraction(firstnumber, secondNumber));
                    break;
                case "*":
                    System.out.println("result = " + Multiply(firstnumber, secondNumber));
                    break;
                case "/":
                    System.out.println("result = " + Division(firstnumber, secondNumber));
                    break;
                default:
                    System.out.println("Oooops, something wrong !");
            }

        }
    }

    public static double Addition(double numOne, double numTwo) {
        return numOne + numTwo;
    }

    public static double Subtraction(double numOne, double numTwo) {
        return numOne - numTwo;
    }

    public static double Division(double numOne, double numTwo) {
        return numOne / numTwo;
    }

    public static double Multiply(double numOne, double numTwo) {
        return numOne * numTwo;
    }
}
