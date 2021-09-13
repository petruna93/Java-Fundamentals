package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String,List<String>> companyUsers = new TreeMap<>();

        while (!input.equals("End")){
            String[] tokens = input.split(" -> ");
            String companyName = tokens[0];
            String employeeID = tokens[1];

            companyUsers.putIfAbsent(companyName,new ArrayList<>());
            if (!companyUsers.get(companyName).contains(employeeID)){
                companyUsers.get(companyName).add(employeeID);
            }
            input=scanner.nextLine();
        }
        companyUsers.entrySet().
                stream()
                .forEach(entry-> {
                    System.out.printf("%s%n", entry.getKey());
                 entry.getValue()
                         .stream()
                         .forEach(x-> System.out.printf("-- %s%n", x));
                });

    }
}
