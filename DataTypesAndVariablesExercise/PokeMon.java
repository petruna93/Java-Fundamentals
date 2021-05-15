package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int countPoked = 0;
        int originalN = n;

        while (n >= m) {
            n -= m;
            countPoked++;
            if (originalN / 2 == n) {
                if (y > 0) {
                    n = n / y;
                }
            }
        }
        System.out.println(n);
        System.out.println(countPoked);
    }
}
