package DataTypesAndVariablesLab;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {
            int num = i;
            int sum = 0;
            while (num>0){
                sum+=num%10;

                num=num/10;
            }
            switch (sum){
                case 5:
                case 7:
                case 11:
                    System.out.printf("%d -> True%n",i);
                    break;
                default:
                    System.out.printf("%d -> False%n",i);
                    break;
            }
        }

    }
}
