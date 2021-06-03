package MethodsExercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        boolean inclusiveCharacters = true;
        boolean lettersOrDigits = true;
        boolean twoDigits = true;

        boolean first = isInclusive(input, inclusiveCharacters);
        boolean second = isLettersDigits(input, lettersOrDigits);
        boolean third = isTwoDigits(input, twoDigits);

        if (first && second && third){
            System.out.println("Password is valid");
        }
        if (!first){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!second){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!third){
            System.out.println("Password must have at least 2 digits");
        }
    }

    private static boolean isTwoDigits(String input, boolean twoDigits) {
        int count = 0;
        for (int i = 0; i <input.length() ; i++) {
            if (Character.isDigit(input.charAt(i))){
                count++;
            }
        }
        if (count<2){
            twoDigits = false;
        }
        return twoDigits;
    }

    private static boolean isLettersDigits(String input, boolean lettersOrDigits) {
        for (int i = 0; i <input.length() ; i++) {
            if (!(Character.isLetter(input.charAt(i)) || Character.isDigit(input.charAt(i)))){
                lettersOrDigits = false;
                break;
            }
       }
        return lettersOrDigits;
    }

    private static boolean isInclusive(String input, boolean inclusiveCharacters) {
        if (input.length()<6 || input.length()>10){
            inclusiveCharacters = false;
        }
        return inclusiveCharacters;
    }
}
