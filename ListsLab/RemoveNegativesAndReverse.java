import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i <numbers.size() ; i++) {
            int num = numbers.get(i);
            if (num<0){
                numbers.remove(numbers.get(i));
                i--;
            }
        }
        if (numbers.size()>0){
        Collections.reverse(numbers);
        for (int i = 0; i <numbers.size() ; i++) {
            System.out.print(numbers.get(i) + " ");
        }
        }else {
            System.out.println("empty");
        }
    }
}
