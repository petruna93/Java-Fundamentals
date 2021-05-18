package ArraysLab;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        for (int i = 0; i <input.length/2 ; i++) {
            String extra = input[i];
            input[i]=input[input.length-i-1];
            input[input.length-i-1]=extra;
        }
        for (int i = 0; i < input.length ; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
