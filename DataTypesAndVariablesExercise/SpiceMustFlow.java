package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int dayCount = 0;
        int yield = 0;

        while (n>=100){
            dayCount++;
            yield+=n-26;
            n-=10;
        }
        if (yield>=26){
            yield-=26;
        }
        System.out.println(dayCount);
        System.out.println(yield);
    }
}
