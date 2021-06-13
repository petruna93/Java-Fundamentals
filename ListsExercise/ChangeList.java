package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[]tokens = input.split("\\s+");
            String command = tokens[0];
            int element = Integer.parseInt(tokens[1]);
            switch (command){
                case "Delete":
                    for (int i = 0; i <numbers.size() ; i++) {
                        if (numbers.get(i)==element){
                            numbers.remove(i);
                        }else{
                            continue;
                        }
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[2]);
                    numbers.add(index,element);
                    break;
            }
            input=scanner.nextLine();
        }

        for (int i = 0; i <numbers.size() ; i++) {
            System.out.print(numbers.get(i) + " ");

        }
    }
}

