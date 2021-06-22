package ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Students> students = new ArrayList<>();

        while (!input.equals("end")){
            String[] tokens = input.split("\\s+");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String city = tokens[3];

            Students student = new Students(firstName,lastName,age,city);
            students.add(student);

            input = scanner.nextLine();
        }
        String town = scanner.nextLine();

        List<Students> filterStudents = students.stream().filter(e -> e.getHomeTown().equals(town))
                .collect(Collectors.toList());
       for (Students student : filterStudents){
           System.out.printf("%s %s is %d years old%n", student.getFirstName(),student.getLastName(),student.getAge());
       }
    }
}
