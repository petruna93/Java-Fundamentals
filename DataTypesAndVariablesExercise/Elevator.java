package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        sum = people/capacity;
        if (people%capacity!=0){
            sum++;
        }
        System.out.println(sum);
    }
}