package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split("\\s++");
            switch (command[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(command[1]));
                    break;
                case "Remove":
                    int indexNum = numbers.indexOf(Integer.parseInt(command[1]));
                    numbers.remove(indexNum);
                    break;
                case "RemoveAt":
                    numbers.remove(Integer.parseInt(command[1]));
                    break;
                case "Insert":
                    numbers.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");

        }
    }
}
