package MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        Map<Character,Integer> maps = new LinkedHashMap<>();

        for (int i = 0; i <word.length() ; i++) {
            char letter = word.charAt(i);
            if (letter != ' ') {
                maps.putIfAbsent(letter, 0);
                maps.put(letter, maps.get(letter) + 1);
            }
        }
        for (Map.Entry<Character,Integer>entry: maps.entrySet()){
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
