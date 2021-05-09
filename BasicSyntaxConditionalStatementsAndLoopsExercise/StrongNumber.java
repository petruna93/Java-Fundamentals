package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int checkedNum = num;

        while (checkedNum>0){
            int digit = checkedNum %10;
            int sumForOneDigit = 1;
            for (int i = 1; i <=digit ; i++) {
                sumForOneDigit = sumForOneDigit * i;
            }
            sum+=sumForOneDigit;

            checkedNum=checkedNum/10;
        }
        if (sum==num){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
