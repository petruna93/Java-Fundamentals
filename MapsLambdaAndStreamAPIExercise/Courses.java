package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> maps = new LinkedHashMap<>();

        while (!input.equals("end")){
            String[] tokens = input.split(" : ");
            String courseName = tokens[0];
            String studentName = tokens[1];

            maps.putIfAbsent(courseName,new ArrayList<>());
            maps.get(courseName).add(studentName);

            input=scanner.nextLine();
        }
        maps.entrySet().stream()
        .sorted((x,y)-> Integer.compare(y.getValue().size(),x.getValue().size()))
        .forEach(entry->{
            System.out.println(String.format("%s: %d", entry.getKey(),entry.getValue().size()));
            entry
                    .getValue().stream()
                    .sorted((x,y)-> x.compareTo(y))
                    .forEach(x -> System.out.println(String.format("-- %s", x)));
        });
    }
}

