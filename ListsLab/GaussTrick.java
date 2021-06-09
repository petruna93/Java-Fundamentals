package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int size = numbers.size();

        for (int i = 0; i <size/2 ; i++) {
            int first = numbers.get(i);
            int last = numbers.get(numbers.size()-1);
            numbers.set(i,first+last);
            numbers.remove(numbers.size()-1);
        }
        for (int number:numbers) {
            System.out.print(number + " ");

        }
    }
}
