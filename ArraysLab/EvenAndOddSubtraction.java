package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrays = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i <arrays.length ; i++) {
            if (arrays[i]%2==0){
                sumEven+=arrays[i];
            }else {
                sumOdd+=arrays[i];
            }
        }
        System.out.println(sumEven-sumOdd);
    }
}
