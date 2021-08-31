package MapsLambdaAndStreamAPILab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
        for (int i = 0; i <Math.min(3,numbers.size()) ; i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
