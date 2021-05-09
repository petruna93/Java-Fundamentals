package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int countStudent = Integer.parseInt(scanner.nextLine());
        double priceLightSabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());


        double moneySabres = priceLightSabers * (Math.ceil(countStudent * 1.1));
        double moneyBelts = (countStudent-(countStudent/6)) * priceBelt;

            double sum = moneySabres + moneyBelts + priceRobes * countStudent;

            if (money >= sum) {
                System.out.printf("The money is enough - it would cost %.2flv.", sum);
            } else {
                System.out.printf("Ivan Cho will need %.2flv more.", sum - money);
            }
        }
    }


