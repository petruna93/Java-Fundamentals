package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> arrays = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Craft!")){
            String[] tokens = input.split(" \\- ");
            String command = tokens[0];
            String items = tokens[1];

            switch (command){
                case "Collect":
                    if (!arrays.contains(items)){
                        arrays.add(items);
                    }
                    break;
                case "Drop":
                    if (arrays.contains(items)){
                        arrays.remove(items);
                    }
                    break;
                case "Combine Items":
                    String[]item = items.split(":");
                    if (arrays.contains(item[0])){
                        int index = arrays.indexOf(item[0]);
                        arrays.add(index+1,item[1]);
                    }
                    break;
                case "Renew":
                    if (arrays.contains(items)){
                        arrays.remove(items);
                        arrays.add(items);
                    }
                    break;

            }
            input=scanner.nextLine();
        }
        for (int i = 0; i < arrays.size()-1 ; i++) {
            System.out.print(arrays.get(i) + ", ");
        }
        System.out.print(arrays.get(arrays.size()-1));
    }
}
