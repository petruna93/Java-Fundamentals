package MethodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        
        smallestThreeNumbers(first,second,third);
    }

    private static void smallestThreeNumbers(int first, int second, int third) {
        if (first<second && first<third){
            System.out.println(first);
        }else if (second<first && second<third){
            System.out.println(second);
        }else {
            System.out.println(third);
        }
    }
}
