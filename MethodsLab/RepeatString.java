package MethodsLab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int repeatCount = Integer.parseInt(scanner.nextLine());

        String newText = newText(text,repeatCount);
        System.out.println(newText);
    }

    private static String newText(String text, int repeatCount) {
        String newText = "";
        for (int i = 0; i <repeatCount ; i++) {
            newText+=text;
        }
        return newText;
    }
}
