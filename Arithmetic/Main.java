package Arithmetic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int integer_number = scan.nextInt();
        System.out.print("Enter a decimal number: ");
        double double_number = scan.nextDouble();

        Arithmetic<Integer, Double> arithmetic = new Arithmetic<>(integer_number, double_number);
        System.out.println("Addition: " + arithmetic.add());
        System.out.println("Subtraction: " + arithmetic.subtract());
        System.out.println("Multiplication: " + arithmetic.multiply());
        System.out.println("Division: " + arithmetic.divide());
        System.out.println("Min: " + arithmetic.getMin());
        System.out.println("Max: " + arithmetic.getMax());
    }
}
