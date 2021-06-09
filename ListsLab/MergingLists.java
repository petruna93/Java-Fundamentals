package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> first = readArrayList(scanner);
        List<Integer> second = readArrayList(scanner);
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < Math.min(first.size(),second.size()) ; i++) {
            int firstNum = first.get(i);
            int secondNum = second.get(i);
            result.add(firstNum);
            result.add(secondNum);
        }
        for (int i = Math.min(first.size(),second.size()); i <Math.max(first.size(),second.size()) ; i++) {
            if (first.size()>second.size()){
              result.add(first.get(i));
            }else {
              result.add(second.get(i));
            }
        }
        for(int num:result){
            System.out.print(num + " ");
        }

    }

    private static List<Integer> readArrayList(Scanner scanner) {
        List<Integer>list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        return list;
    }
}

