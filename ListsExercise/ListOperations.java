package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command){
                case "Add":
                    numbers.add(Integer.parseInt(tokens[1]));
                    break;
                case "Insert":
                    int num = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);
                    if (index<0 ||  index>=numbers.size()){
                        System.out.println("Invalid index");
                    }else {
                        numbers.add(index, num);
                    }
                    break;
                case "Remove":
                    if (Integer.parseInt(tokens[1])<0 ||  Integer.parseInt(tokens[1])>=numbers.size()){
                        System.out.println("Invalid index");
                    }else {
                        numbers.remove(Integer.parseInt(tokens[1]));
                    }
                    break;
                case "Shift":
                    for (int i = 0; i <Integer.parseInt(tokens[2]) ; i++) {

                    if (tokens[1].equals("left")) {
                        int extra = numbers.get(0);
                        numbers.remove(0);
                        numbers.add(extra);
                    }else {
                        int extra = numbers.get(numbers.size()-1);
                        numbers.add(0,extra);
                        numbers.remove(numbers.size()-1);
                    }

                    }
                    break;
            }
            input=scanner.nextLine();
        }
        for (int i = 0; i <numbers.size() ; i++) {
            System.out.print(numbers.get(i) + " ");

        }
    }
}
