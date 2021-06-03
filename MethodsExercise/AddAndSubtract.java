package MethodsExercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        
        int sum = sumMethod(first,second);
        int subtract = subtractMethod(sum,third);

        System.out.println(subtract);
    }

    private static int subtractMethod(int sum, int third) {
        int result = sum - third;
        return result;
    }

    private static int sumMethod(int first, int second) {
        int result = first+second;
        return result;
    }
}
