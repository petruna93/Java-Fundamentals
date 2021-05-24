package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualsSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrays = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        if (arrays.length==1){
            System.out.println("0");
            return;
        }

        for (int i = 0; i <arrays.length ; i++) {
            int leftSum = 0;
            int rightSum = 0;


            for (int j = 0; j <i ; j++) {
              leftSum+=arrays[j];
            }
            for (int j = i+1; j < arrays.length ; j++) {
                rightSum+=arrays[j];
            }
            if (leftSum==rightSum){
                System.out.println(i);
                return;
            }

        }
        System.out.println("no");

    }
}
