package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double bestSnowballValue = 0;
        int bestSnowballSnow = 0;
        int bestSnowballTime = 0;
        int bestSnowballQuality = 0;

        for (int i = 0; i <n ; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow/snowballTime),snowballQuality);

            if (snowballValue>bestSnowballValue){
                bestSnowballValue=snowballValue;
                bestSnowballSnow=snowballSnow;
                bestSnowballTime=snowballTime;
                bestSnowballQuality=snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", bestSnowballSnow,bestSnowballTime,bestSnowballValue,bestSnowballQuality);

    }
}
