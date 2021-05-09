package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String correctPassword = new StringBuffer(password).reverse().toString();
        int count = 0;

        while (count < 4) {
            String input = scanner.nextLine();
            if (correctPassword.equals(input)) {
                System.out.printf("User %s logged in.", password);
                break;
            } else {
                count++;
                if (count>3){
                    break;
                }
                System.out.println("Incorrect password. Try again.");

            }
        }
        if (count>3){
            System.out.printf("User %s blocked!",password);
        }
    }
}
