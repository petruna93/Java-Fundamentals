package ObjectsAndClassesExercise.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person person = new Person(name, age);
            if (person.getAge() > 30) {
                persons.add(person);
            }
        }

     persons.stream().sorted((x,y) -> x.getName().compareTo(y.getName()))
     .forEach(x -> System.out.println(x.getName() + " - " + x.getAge()));
    }
}
