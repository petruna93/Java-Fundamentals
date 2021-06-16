package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        String[] tokens = input.split("\\s+");
        int specialNum = Integer.parseInt(tokens[0]);
        int power = Integer.parseInt(tokens[1]);

        while (numbers.contains(specialNum)) {
            int index = numbers.indexOf(specialNum);
            int start = Math.max(0, index - power);
            int end = Math.min(index + power, numbers.size() - 1);
            for (int i = end; i >= start; i--) {
                numbers.remove(i);
            }
        }
        int sum = 0;

        for (int i = 0; i <numbers.size() ; i++) {
            sum+=numbers.get(i);
        }
        System.out.println(sum);
    }
}
