package ArraysExercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] first = scanner.nextLine().split("\\s+");
        String[] second = scanner.nextLine().split("\\s+");


        for (int i = 0; i < second.length; i++) {
            for (int j = 0; j < first.length; j++) {
                if (first[j].equals(second[i])) {
                    System.out.print(second[i] + " ");
                }
            }
        }
    }
}
