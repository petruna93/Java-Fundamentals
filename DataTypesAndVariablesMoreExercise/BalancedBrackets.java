package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int openBrackets = 0;
        int closeBrackets = 0;

        for (int i = 0; i < num; i++) {
            String input = scanner.nextLine();

            if (input.equals("(")) {
                openBrackets++;
            }
            if (input.equals(")") && openBrackets > closeBrackets) {
                closeBrackets++;
            } else if (input.equals(")") &&  openBrackets<=closeBrackets){
               System.out.println("UNBALANCED");
                return;
            }
        }
        if (openBrackets == closeBrackets) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }

    }
}
