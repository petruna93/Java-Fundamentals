package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command){
                case "Contains":
                    int num = Integer.parseInt(tokens[1]);
                   if (numbers.contains(num)){
                       System.out.println("Yes");
                   }else {
                       System.out.println("No such number");
                   }
                    break;
                case "Print":
                    String evenOrOdd = tokens[1];
                    if (evenOrOdd.equals("even")){
                        for (int i = 0; i <numbers.size() ; i++) {
                         int singleNum = numbers.get(i);
                         if (singleNum%2==0){
                             System.out.print(singleNum + " ");
                         }
                        }
                        System.out.println();
                    }else {
                        for (int i = 0; i <numbers.size() ; i++) {
                            int singleNum = numbers.get(i);
                            if (singleNum%2!=0){
                                System.out.print(singleNum + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i <numbers.size() ; i++) {
                        sum += numbers.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String sign = tokens[1];
                    int number = Integer.parseInt(tokens[2]);
                    filter(sign,number, numbers);
                    break;
            }
            input=scanner.nextLine();
        }
    }

    private static void filter(String sign, int number, List<Integer> numbers) {
        for (int i = 0; i <numbers.size() ; i++) {
            if (sign.equals("<") && numbers.get(i)<number){
                System.out.print(numbers.get(i) + " ");
            }else if (sign.equals(">") && numbers.get(i)>number){
                System.out.print(numbers.get(i) + " ");
            }else if (sign.equals("<=") && numbers.get(i)<=number){
                System.out.print(numbers.get(i) + " ");
            }else if (sign.equals(">=") && numbers.get(i)>=number){
                System.out.print(numbers.get(i) + " ");
            }
        }
        System.out.println();
    }
}
