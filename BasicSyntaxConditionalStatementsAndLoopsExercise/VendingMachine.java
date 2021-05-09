package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("Start")){
            double money = Double.parseDouble(input);
            if (money==0.1 || money==0.2 || money==0.5 || money==1.0 || money==2){
                sum+=money;
            }else {
                System.out.printf("Cannot accept %.2f%n", money);
            }
            input=scanner.nextLine();
        }
        String products = scanner.nextLine();
        double price = 0;
        boolean isTrue = false;
        while (!products.equals("End")){
            if (products.equals("Nuts")){
                price = 2.0;
            }else if (products.equals("Water")){
                price = 0.70;
            }else if (products.equals("Crisps")){
                price = 1.50;
            }else if (products.equals("Soda")){
                price = 0.80;
            }else if (products.equals("Coke")){
                price = 1.0;
            }else {
                System.out.println("Invalid product");
                isTrue = true;
            }

            if (sum<price){
                System.out.println("Sorry, not enough money");
            }else if (sum>=price && !isTrue){
                System.out.printf("Purchased %s%n",products);
                sum-=price;
            }
            products=scanner.nextLine();
            isTrue=false;
        }
            System.out.printf("Change: %.2f", sum);
        }
    }

