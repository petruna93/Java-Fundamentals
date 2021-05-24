package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrays = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i <arrays.length ; i++) {
            int num = arrays[i];
            boolean isTrue = true;
            for (int j = i+1; j < arrays.length ; j++) {
                if (arrays[j]>=num){
                    isTrue=false;
                }
            }
            if (isTrue){
                System.out.print(num + " ");
            }

        }
    }
}
