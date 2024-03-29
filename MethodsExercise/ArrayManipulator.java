package MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();


        String input = scanner.nextLine();
        while(!input.equals("end")){
            String[] tokens = input.split(" ");
            String command = tokens[0];

            switch (command) {
                case "exchange": {
                    int index = Integer.parseInt(tokens[1]);
                    if (index < 0 || index >= array.length) {
                        System.out.println("Invalid index");
                    } else {
                        exchange (array, index);
                    }
                }
                break;
                case "min": {
                    String evenOrOdd = tokens[1];
                    if (evenOrOdd.equals("even")) {
                        findMinEven(array);
                    } else if (evenOrOdd.equals("odd")) {
                        findMinOdd(array);
                    }
                }
                break;
                case "max": {
                    String evenOrOdd = tokens[1];
                    if (evenOrOdd.equals("even")) {
                        findMaxEven(array);
                    } else if (evenOrOdd.equals("odd")) {
                        findMaxOdd(array);
                    }
                }
                break;
                case "first": {
                    int count = Integer.parseInt(tokens[1]);
                    if (count > array.length) {
                        System.out.println("Invalid count");
                    } else {
                        String evenOrOdd = tokens[2];
                        if (evenOrOdd.equals("even")) {
                            findFirstCountEvenNumbers(array, count);
                        } else if (evenOrOdd.equals("odd")) {
                            findMFirstCountOddNumber(array, count);
                        }
                    }
                }
                break;
                case "last": {
                    int count = Integer.parseInt(tokens[1]);
                    if (count > array.length) {
                        System.out.println("Invalid count");
                    } else {
                        String evenOrOdd = tokens[2];
                        if (evenOrOdd.equals("even")) {
                            findLastCountEvenNumbers(array, count);
                        } else if (evenOrOdd.equals("odd")) {
                            findMLastCountOddNumber(array, count);
                        }
                    }
                }
                break;
            }
            input = scanner.nextLine();
        }
        printArray(array);
    }

    private static void findMLastCountOddNumber(int[] array, int count) {
        int[]result = new int[0];
        for (int i = array.length-1; i >=0 ; i--) {
            if (array[i]%2 !=0){
                result=expandAndToArray (result,array[i]);
                if (result.length==count){
                    break;
                }
            }

        }
        reverseArray(result);
        printArray(result);


    }

    private static void findLastCountEvenNumbers(int[] array, int count) {
        int[]result = new int[0];
        for (int i = array.length-1; i >=0 ; i--) {
            if (array[i]%2 ==0){
                result=expandAndToArray (result,array[i]);
                if (result.length==count){
                    break;
                }
            }

        }
        reverseArray(result);
        printArray(result);
    }
    private static void reverseArray(int[] array){
        int[] temp = copyArray(array);
        for (int i = array.length-1; i >=0 ; i--) {
            array[i]=temp[array.length-1-i];
        }
    }

    private static void findMFirstCountOddNumber(int[] array, int count) {
        int[]result = new int[0];
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%2 !=0){
                result=expandAndToArray (result,array[i]);
                if (result.length==count){
                    break;
                }
            }

        }
        printArray(result);
    }

    private static void findFirstCountEvenNumbers(int[] array, int count) {
        int[]result = new int[0];
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%2 ==0){
                result=expandAndToArray (result,array[i]);
                if (result.length==count){
                    break;
                }
            }

        }
        printArray(result);
    }

    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i <array.length ; i++) {
            if (i==0){
                System.out.print(array[i]);
            }else{
                System.out.print(", " + array[i]);
            }
        }
        System.out.println("]");
    }

    private static int[] expandAndToArray(int[] oldArray, int newElement) {
        int[] newArray = new int[oldArray.length+1];
        for (int i = 0; i <oldArray.length; i++) {
            newArray[i]= oldArray[i];
        }
        newArray[newArray.length-1]=newElement;
        return newArray;
    }

    private static void findMaxOdd(int[] array) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && max <= array[i]) {
                max = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void findMaxEven(int[] array) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && max <= array[i]) {
                max = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void findMinOdd(int[] array) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && min >= array[i]) {
                min = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void findMinEven(int[] array) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && min >= array[i]) {
                min = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void exchange(int[] array, int index) {
        int[] temp = copyArray(array);
        int count = 0;
        for (int i = index+1; i <temp.length ; i++) {
            array[count] = temp[i];
            count++;
        }
        for (int i = 0; i <=index ; i++) {
            array[count] = temp[i];
            count++;
        }
    }
    public static int[] copyArray(int[] arr){
        int[] newArray = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }
}

