package MapsLambdaAndStreamAPILab;

import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]nums = Arrays.stream(scanner.nextLine().split("\\s+"))
        .mapToInt(Integer::parseInt).toArray();
        TreeMap<Integer,Integer> counts = new TreeMap<>();

        for (int i = 0; i < nums.length ; i++) {
            if (!counts.containsKey(nums[i])){
                counts.put(nums[i],0);
            }
            counts.put(nums[i], counts.get(nums[i])+1);
        }
        for (Map.Entry<Integer,Integer> map : counts.entrySet()){
            System.out.printf("%d -> %d%n", map.getKey(), map.getValue());

        }
    }
}
