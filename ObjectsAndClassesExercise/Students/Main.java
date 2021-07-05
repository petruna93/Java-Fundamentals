package ObjectsAndClassesExercise.Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Students> students = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String firstName = tokens[0];
            String lastName = tokens[1];
            double grade = Double.parseDouble(tokens[2]);

            Students student = new Students(firstName,lastName,grade);
            students.add(student);
        }
        students.sort(Comparator.comparingDouble(Students::getGrade).reversed());
        for (Students student:students){
            System.out.println(student.toString());
        }
    }

}
