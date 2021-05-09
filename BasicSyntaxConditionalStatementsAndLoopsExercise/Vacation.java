package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        if (typeGroup.equals("Students")){
            if (day.equals("Friday")){
               price = 8.45;
            }else if (day.equals("Saturday")){
               price = 9.8;
            }else if (day.equals("Sunday")){
               price = 10.46;
            }
        }else if (typeGroup.equals("Business")){
            if (day.equals("Friday")){
                price = 10.90;
            }else if (day.equals("Saturday")){
                price = 15.60;
            }else if (day.equals("Sunday")){
                price = 16.00;
            }
        }else if (typeGroup.equals("Regular")){
            if (day.equals("Friday")){
                price = 15.00;
            }else if (day.equals("Saturday")){
                price = 20.00;
            }else if (day.equals("Sunday")){
                price = 22.50;
            }
        }
        double totalSum = price * people;
        if (typeGroup.equals("Students") && people>=30){
            totalSum*=0.85;
        }
        if (typeGroup.equals("Business") && people>=100){
            totalSum = totalSum - 10*price;
        }
        if (typeGroup.equals("Regular") && (people>=10 && people<=20)){
            totalSum*=0.95;
        }
        System.out.printf("Total price: %.2f", totalSum);
    }
}
