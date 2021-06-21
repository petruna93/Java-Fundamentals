package ObjectsAndClassesLab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        Random rnd = new Random();

        for (int i = 0; i <input.length ; i++) {
            int index = rnd.nextInt(input.length);

            String temp = input[i];
            input[i] = input[index];
            input[index]=temp;
        }
        for(String word:input){
            System.out.println(word);
        }
    }
}
