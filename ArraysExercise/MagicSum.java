package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrays = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <arrays.length ; i++) {
            int num = arrays[i];
            for (int j = i+1; j <arrays.length ; j++) {
                int secondNum = arrays[j];

                if (num+secondNum==n){
                    System.out.print(num + " " + secondNum);
                    System.out.println();
                }
            }
        }
    }
}
