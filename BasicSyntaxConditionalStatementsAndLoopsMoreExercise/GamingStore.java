package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentBalance = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double price = 0;
        double spent = 0;
        boolean isTrue = true;

        while (!input.equals("Game Time")) {
            String game = input;
            switch (game) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    isTrue = false;
                    break;
            }


            if (currentBalance < price) {
                System.out.println("Too Expensive");
            } else if (currentBalance >= 0 && isTrue) {
                currentBalance -= price;
                System.out.printf("Bought %s%n", game);
                spent += price;
            }
            if (currentBalance <= 0) {
                System.out.println("Out of money!");
                return;
            }
                isTrue = true;
                input = scanner.nextLine();
            }
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spent, currentBalance);
        }
    }
