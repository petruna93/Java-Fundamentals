package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] first = new int[n];
        int[] second = new int[n];

        for (int i = 0; i < n; i++) {
            int[] arrays = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            if (i % 2 != 0) {
                first[i] = arrays[1];
                second[i] = arrays[0];
            } else {
                first[i] = arrays[0];
                second[i] = arrays[1];
            }
        }
        for (int i = 0; i < first.length ; i++) {
            System.out.print(first[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < second.length ; i++) {
            System.out.print(second[i] + " ");
        }
    }
}
