package ListsLab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i <numbers.size()-1 ; i++) {
            double first = numbers.get(i);
            double second = numbers.get(i+1);
            if (first==second){
                numbers.set(i,first+second);
                numbers.remove(i+1);
                i=-1;
            }
        }
        for (int i = 0; i <numbers.size() ; i++) {
            System.out.print(new DecimalFormat("0.###").format(numbers.get(i))+ " ");

        }
    }
}
