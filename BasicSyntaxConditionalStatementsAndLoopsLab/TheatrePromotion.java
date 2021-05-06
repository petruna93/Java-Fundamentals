package BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;

        if (typeOfDay.equals("Weekday") && (age >= 0 && age <= 18)) {
            price = 12;
        } else if (typeOfDay.equals("Weekday") && (age > 18 && age <= 64)) {
            price = 18;
        } else if (typeOfDay.equals("Weekday") && (age > 64 && age <= 122)) {
            price = 12;
        } else if (typeOfDay.equals("Weekend") && (age >= 0 && age <= 18)) {
            price = 15;
        } else if (typeOfDay.equals("Weekend") && (age > 18 && age <= 64)) {
            price = 20;
        } else if (typeOfDay.equals("Weekend") && (age > 64 && age <= 122)) {
            price = 15;
        } else if (typeOfDay.equals("Holiday") && (age >= 0 && age <= 18)) {
            price = 5;
        } else if (typeOfDay.equals("Holiday") && (age > 18 && age <= 64)) {
            price = 12;
        } else if (typeOfDay.equals("Holiday") && (age > 64 && age <= 122)) {
            price = 10;
        }else {
            System.out.println("Error!");
            return;
        }
        System.out.printf("%d$", price);
    }
}
