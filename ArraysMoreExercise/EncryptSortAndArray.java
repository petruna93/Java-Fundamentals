package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class EncryptSortAndArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] input = new String[n];
        int[] sort = new int[n];


        for (int i = 0; i < n ; i++) {
            input[i] = scanner.nextLine();
        }

        for (int i = 0; i <n ; i++) {
            char[] encrypt = input[i].toCharArray();
            int sumVowel = 0;
            int sumConsonant = 0;

            for (int j = 0; j < encrypt.length ; j++) {

                switch (encrypt[j]) {
                    case 'a':
                    case 'e':
                    case 'o':
                    case 'i':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'O':
                    case 'I':
                    case 'U':
                        sumVowel = sumVowel + (encrypt[j] * (input[i].length()));
                        break;
                    default:
                        sumConsonant = sumConsonant + (encrypt[j] / input[i].length());
                        break;
                }
            }

                    sort[i] = sumVowel+sumConsonant;
            }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n ; j++) {
                int tempSort;
                if (sort[i]<sort[j]){
                    tempSort = sort[i];
                    sort[i] = sort [j];
                    sort[j] = tempSort;
                }

            }

        }
        for (int i = 0; i <n ; i++) {
            System.out.println(sort[i]);

        }

        }

    }

