package ListsExercise;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");
        List<String> number = new ArrayList<>();

        for (int i = input.length - 1; i >= 0; i--) {
            String[] parts = input[i].split("\\s+");
            for (String s : parts) {
                if (!s.equals("")) {
                    number.add(s);
                }
            }
        }
        System.out.println(String.join(" ", number));
    }
}

