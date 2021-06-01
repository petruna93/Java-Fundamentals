package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        double result = result(num,power);
        System.out.print(new DecimalFormat("0.###").format(result));

    }
    private static double result(double num,int power){
        return Math.pow(num,power);
    }
}
