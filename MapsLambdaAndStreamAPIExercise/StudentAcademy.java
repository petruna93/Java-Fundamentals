package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> maps = new LinkedHashMap<>();

        for (int i = 0; i <num ; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            maps.putIfAbsent(name,new ArrayList<>());
            maps.get(name).add(grade);
        }
        maps.entrySet().stream()
                .filter(x-> x.getValue().stream().mapToDouble(Double::doubleValue)
                .average().getAsDouble()>=4.50)
                .sorted((x,y)-> {
                    double first = x.getValue().stream().mapToDouble(Double::doubleValue)
                            .average().getAsDouble();
                    double second = y.getValue().stream().mapToDouble(Double::doubleValue)
                            .average().getAsDouble();
                    return Double.compare(second, first);
                })
                .forEach(x-> System.out.printf("%s -> %.2f%n", x.getKey(),x.getValue().stream()
                .mapToDouble(Double::doubleValue).average().getAsDouble()));
    }
}

