package ObjectsAndClassesExercise.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List <VehicleCatalogue> vehicleCatalogues = new ArrayList<>();

        while (!input.equals("End")){
            String[] tokens = input.split("\\s+");
            String type = tokens[0];
            String model = tokens[1];
            String color = tokens[2];
            int horsepower = Integer.parseInt(tokens[3]);

            VehicleCatalogue vehicleCatalogue = new VehicleCatalogue(type,model,color,horsepower);
            vehicleCatalogues.add(vehicleCatalogue);

            input=scanner.nextLine();
        }
        String command = scanner.nextLine();
        while (!command.equals("Close the Catalogue")){
            String receiveVehicle = command;
             vehicleCatalogues.stream().filter(x-> x.getModel().equals(receiveVehicle))
                     .forEach(System.out::println);

            command= scanner.nextLine();
        }
        System.out.println(String.format("Cars have average horsepower of: %.2f.", average(vehicleCatalogues.stream()
                .filter(v -> v.getTypeOfVehicle().equals("car"))
                .collect(Collectors.toList()))));

        System.out.println(String.format("Trucks have average horsepower of: %.2f.", average(vehicleCatalogues.stream()
                .filter(v -> v.getTypeOfVehicle().equals("truck"))
                .collect(Collectors.toList()))));
    }
    private static double average(List<VehicleCatalogue> vehicles) {
        if (vehicles.size() == 0) {
            return 0.0;
        }
        double sum = 0;

        for (VehicleCatalogue vehicleCatalogue: vehicles) {
            sum += vehicleCatalogue.getHorsepower();
        }
        return sum / vehicles.size();
    }




}
