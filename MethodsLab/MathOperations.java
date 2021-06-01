package MethodsLab;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int second = Integer.parseInt(scanner.nextLine());

        switch (operator){
            case "/":
                divide(first,second);
                break;
            case "*":
                multiply(first,second);
                break;
            case "+":
                plus(first,second);
                break;
            case "-":
                subtract(first,second);
                break;
        }

    }

    private static void subtract(int first, int second) {
        System.out.println(first-second);
    }

    private static void plus(int first, int second) {
        System.out.println(first+second);
    }

    private static void multiply(int first, int second) {
        System.out.println(first*second);
    }

    private static void divide(int first, int second) {
        System.out.println(first/second);
    }
}
