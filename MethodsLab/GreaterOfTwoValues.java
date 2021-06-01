package MethodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type){
            case "int":
                int first = Integer.parseInt(scanner.nextLine());
                int second = Integer.parseInt(scanner.nextLine());
                maxInt(first,second);
                break;
            case "char":
                char symbolOne = scanner.nextLine().charAt(0);
                char symbolTwo = scanner.nextLine().charAt(0);
                maxChar(symbolOne,symbolTwo);
                break;
            case "string":
                String one = scanner.nextLine();
                String two = scanner.nextLine();
                maxString(one,two);
                break;
        }
    }

    private static void maxString(String one, String two) {
        if (one.compareTo(two)>=0) {
            System.out.println(one);
        }else {
            System.out.println(two);
        }

    }

    private static void maxChar(char symbolOne, char symbolTwo) {
        if (symbolOne>symbolTwo){
            System.out.println(symbolOne);
        }else {
            System.out.println(symbolTwo);
        }
    }

    private static void maxInt(int first, int second) {
        if (first>second){
            System.out.println(first);
        }else {
            System.out.println(second);
        }
    }
}
