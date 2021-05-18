package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] first = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();


        while (first.length>1){
            int[]condensed = new int[first.length-1];
            for (int i = 0; i < first.length-1 ; i++) {
                int num = first[i] + first[i+1];
                condensed[i]=num;
            }
            first=condensed;
        }
        System.out.println(first[0]);

    }
}

