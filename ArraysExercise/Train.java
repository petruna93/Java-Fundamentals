package ArraysExercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagons = Integer.parseInt(scanner.nextLine());
        int[] trains = new int[wagons];
        int sum = 0;
        for (int i = 0; i < wagons; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            trains[i] = n;
            sum += n;
        }

        for (int train: trains) {
            System.out.print(train + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}


