package MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> keyMaterials = new TreeMap<>();
        Map<String, Integer> junk = new TreeMap<>();
        boolean flag = true;
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        while (flag) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int i = 0; i < input.length - 1; i += 2) {
                String farms = input[i + 1].toLowerCase();
                int quantity = Integer.parseInt(input[i]);

                if (farms.equals("shards") || farms.equals("fragments") || farms.equals("motes")) {
                    keyMaterials.put(farms, keyMaterials.get(farms) + quantity);
                    if ((keyMaterials.get(farms)) >= 250) {
                        keyMaterials.put(farms, keyMaterials.get(farms) - 250);
                        if (farms.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (farms.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else if (farms.equals("motes")) {
                            System.out.println("Dragonwrath obtained!");
                        }
                        flag = false;
                        break;
                    }
                } else {
                    junk.putIfAbsent(farms, 0);
                    junk.put(farms, junk.get(farms) + quantity);
                }
            }
        }
        keyMaterials.entrySet().stream()
                .sorted((x1,x2)->{
                    int result = x2.getValue().compareTo(x1.getValue());
                    if (result==0){
                        result= x1.getKey().compareTo(x2.getKey());
                    }
                    return result;
                }).forEach(x-> System.out.println(x.getKey()+ ": " + x.getValue()));

        for (Map.Entry<String,Integer> entry : junk.entrySet()){
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
    }
}
