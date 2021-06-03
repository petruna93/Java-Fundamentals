package MethodsExercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        long firstResult = factorial(first);
        long secondResult = factorial(second);

        double finalResult = (double)firstResult/secondResult;
        System.out.printf("%.2f",finalResult);
    }

    private static long factorial(int n) {
        long sum = 1;
        for (int i = 1; i <=n ; i++) {
            sum*=i;
        }
        return sum;
    }
}
