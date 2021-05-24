package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrays = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int maxCount = 1;
        int repeatingNum = arrays[0];


        for (int i = 0; i < arrays.length; i++) {
            int num = arrays[i];
            int count = 1;

            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[j] == num) {
                    count++;
                } else {
                    break;
                }
                if (count>maxCount){
                    maxCount=count;
                    repeatingNum = num;
                }
            }
        }
        for (int i = 0; i <maxCount ; i++) {
            System.out.print(repeatingNum + " ");
        }
    }
}
