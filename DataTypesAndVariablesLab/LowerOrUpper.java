package DataTypesAndVariablesLab;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.nextLine().charAt(0);

        int num = symbol;
        if (num>=65 &&  num<=90){
            System.out.println("upper-case");
        }else{
            System.out.println("lower-case");
        }
    }
}
