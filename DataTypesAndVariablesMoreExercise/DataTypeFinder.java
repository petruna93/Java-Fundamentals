package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String type = "";

        while (!input.equals("END")){
            Scanner entryType = new Scanner(input);
            if (entryType.hasNextBoolean()){
                type="boolean";
            }else if (entryType.hasNextInt()){
                type="integer";
            }else if (input.length()==1){
                type="character";
            }else if (entryType.hasNextDouble()){
                type="floating point";
            }else if (entryType.hasNextLine()){
                type="string";
            }
            System.out.printf("%s is %s type%n",input,type);

            input = scanner.nextLine();
        }
    }
}
