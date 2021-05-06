package BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int start = Integer.parseInt(scanner.nextLine());


        if (start > 10) {
            int result = n * start;
            System.out.printf("%d X %d = %d%n", n, start, result);
        } else {

            for (int i = start; i <= 10; i++) {
                int result = n * i;
                System.out.printf("%d X %d = %d%n", n, i, result);
            }
        }
    }
}
