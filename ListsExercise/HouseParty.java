package ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> guest = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            if (tokens[2].equals("not")){
                if (guest.contains(tokens[0])) {
                    guest.remove(tokens[0]);
                }else {
                    System.out.printf("%s is not in the list!%n", tokens[0]);
                }
            }else {
               if (guest.contains(tokens[0])){
                   System.out.printf("%s is already in the list!%n",tokens[0]);
               }else {
                   guest.add(tokens[0]);
               }
            }
        }
        for (int i = 0; i <guest.size() ; i++) {
            System.out.println(guest.get(i));
        }
    }
}
