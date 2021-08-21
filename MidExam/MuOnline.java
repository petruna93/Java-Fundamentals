package MidExam;

import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialHealth = 100;
        int initialBitcoins = 0;
        String[] input = scanner.nextLine().split("\\|");

        for (int i = 0; i <input.length ; i++) {
            String[] token = input[i].split("\\s+");
            String command = token[0];
            int number = Integer.parseInt(token[1]);
            switch (command){
                case "potion":
                    int sum=Math.min(100,initialHealth+number);
                    int diff = sum-initialHealth;
                    initialHealth=sum;
                    System.out.printf("You healed for %d hp.%n",diff);
                    System.out.printf("Current health: %d hp.%n",initialHealth);
                    break;
                case "chest":
                    initialBitcoins+=number;
                    System.out.printf("You found %d bitcoins.%n", number);
                    break;
                default:
                    initialHealth-=number;
                    if (initialHealth<=0){
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d%n", i+1);
                        return;
                    }
                    System.out.printf("You slayed %s.%n", command);
                    break;
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n", initialBitcoins);
        System.out.printf("Health: %d", initialHealth);
    }
}
