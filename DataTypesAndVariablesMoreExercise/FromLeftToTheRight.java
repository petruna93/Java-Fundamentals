package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {
            long first = Long.parseLong(scanner.next());
            long second = Long.parseLong(scanner.next());
            int sum = 0;
            if (first>second){
                while (first>0){
            sum +=first%10;
            first=first/10;
                }
            }else {
                while (second>0){
                    sum +=second%10;
                    second=second/10;
                }
            }
            System.out.println(sum);
        }
    }
}
