package MapsLambdaAndStreamAPILab;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] word = scanner.nextLine().split("\\s+");
        Map<String,Integer> maps = new LinkedHashMap<>();

        for (int i = 0; i < word.length; i++) {
            String words = word[i].toLowerCase();
            maps.putIfAbsent(words,0);
            maps.put(words,maps.get(words)+1);
        }
        List<String> odds = new ArrayList<>();
        for (Map.Entry<String, Integer> entry:maps.entrySet()){
            if (entry.getValue()%2!=0){
                odds.add(entry.getKey());
            }
        }

        for (int i = 0; i <odds.size()-1 ; i++) {
            System.out.print(odds.get(i)+ ", " );
        }
        System.out.println(odds.get(odds.size()-1));

    }
}
