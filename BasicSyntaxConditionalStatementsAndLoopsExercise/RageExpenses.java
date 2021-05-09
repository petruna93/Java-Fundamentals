package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double headsetSum = (lostGamesCount / 2) * headsetPrice;
        double mouseSum = (lostGamesCount / 3) * mousePrice;
        double keyboardSum = (lostGamesCount/ 6) * keyboardPrice;
        double displaySum = (lostGamesCount/12)*displayPrice;

        double sum = headsetSum+mouseSum+keyboardSum+displaySum;

        System.out.printf("Rage expenses: %.2f lv.",sum);
    }
}
