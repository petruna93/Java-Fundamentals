package ObjectsAndClassesExercise.OrderedByName;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Person> persons = new ArrayList<>();

        while (!input.equals("End")){
            String[]tokens = input.split("\\s+");
            String name = tokens[0];
            String ID = tokens[1];
            int age = Integer.parseInt(tokens[2]);

            Person person = new Person(name,ID, age);
            persons.add(person);

            input=scanner.nextLine();
        }
        persons.stream().sorted((x,y) -> Integer.compare(x.getAge(),y.getAge()))
                .forEach(System.out::println);
    }
}
