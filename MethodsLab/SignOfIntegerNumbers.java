package MethodsLab;

import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        signInteger(n);
    }

    private static void signInteger(int n) {
        System.out.print("The number " + n + " is ");
        if (n>0){
            System.out.print("positive.");
        }else if(n<0){
            System.out.print("negative.");
        }else {
            System.out.print("zero.");
        }
    }
}
