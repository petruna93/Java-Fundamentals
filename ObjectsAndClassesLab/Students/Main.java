package ObjectsAndClassesLab.Students;

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

            if (isStudentExisting(students,firstName,lastName)){
                Students student = getStudent(students,firstName,lastName);

                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHomeTown(city);

            }else {
                Students student = new Students(firstName, lastName, age, city);
                students.add(student);
            }

            input = scanner.nextLine();
        }
        String town = scanner.nextLine();

        List<Students> filterStudents = students.stream().filter(e -> e.getHomeTown().equals(town))
                .collect(Collectors.toList());
       for (Students student : filterStudents){
           System.out.printf("%s %s is %d years old%n", student.getFirstName(),student.getLastName(),student.getAge());
       }
    }

    private static Students getStudent(List<Students> students, String firstName, String lastName) {
        Students existingStudent = null;
        for (Students student:students){
            existingStudent=student;
        }
        return existingStudent;
    }

    private static boolean isStudentExisting(List<Students> students, String firstName, String lastName) {
        for (Students student: students){
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }
}
