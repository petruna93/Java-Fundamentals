package MethodsLab;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());

        grades(n);
    }

    private static void grades(double n) {
        if (n>=2.0 && n<=2.99){
            System.out.println("Fail");
        }else if (n>=3.0 && n<=3.49){
            System.out.println("Poor");
        }else if (n>=3.5 && n<=4.49){
            System.out.println("Good");
        }else if (n>=4.5 && n<=5.49){
            System.out.println("Very good");
        }else if (n>=5.5 && n<=6.00){
            System.out.println("Excellent");
        }
    }
}
