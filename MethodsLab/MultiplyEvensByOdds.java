package MethodsLab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Math.abs(Integer.parseInt(scanner.nextLine()));
        int result = multiplyEvensAndOdd(num);
        System.out.println(result);
    }

    private static int multiplyEvensAndOdd(int num) {
        int sumOddNum = 0;
        int sumEvenNum = 0;

        while (num>0){
            int digit = num%10;
            num=num/10;
            if (digit%2==0){
              sumEvenNum+=digit;
            }else {
               sumOddNum+=digit;
            }
        }
        return sumEvenNum*sumOddNum;
    }
}
