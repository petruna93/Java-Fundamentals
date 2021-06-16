package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> first = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> second = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (!first.isEmpty() && !second.isEmpty()){
                if (first.get(0)>second.get(0)){
                 first.add(first.get(0));
                 first.add(second.get(0));
                 first.remove(0);
                 second.remove(0);
                }else if (second.get(0)>first.get(0)){
                    second.add(second.get(0));
                    second.add(first.get(0));
                    second.remove(0);
                    first.remove(0);
                }else {
                    first.remove(0);
                    second.remove(0);
                }
            }

        if (first.size()>0){
            int sum = sum(first);
            System.out.printf("First player wins! Sum: %d", sum);
        }else {
            int secondSum = sum(second); 
            System.out.printf("Second player wins! Sum: %d", secondSum);
        }
    }

    private static int sum(List<Integer> first) {
        int sum = 0;
        for (int i = 0; i <first.size() ; i++) {
            sum+=first.get(i);
        }
        return sum;
    }
}

