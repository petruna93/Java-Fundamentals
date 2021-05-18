package ArraysLab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arrays = new int[n];

        for (int i = 0; i <n ; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            arrays[i]=num;
        }
        for (int i = arrays.length-1; i >=0 ; i--) {
            System.out.print(arrays[i] + " ");
        }
    }
}
