package ListsLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            String newProduct = scanner.nextLine();
            products.add(newProduct);
        }
        Collections.sort(products);
        int count = 1;
        for (int i = 0; i <products.size() ; i++) {
            System.out.println(count + "." + products.get(i));
            count++;
        }

    }
}
