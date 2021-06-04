package MethodsExercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int num = i;
            checked(num);
        }
    }

    private static void checked(int num) {
        int number = num;
        int count = 0;
        int sum = 0;

        while (number>0){
            int lastDigit = number%10;
            sum+=lastDigit;
            if (lastDigit%2!=0){
                count++;
            }
            number=number/10;
        }
        if (sum%8==0 && count>0){
            System.out.println(num);
        }
    }
}
