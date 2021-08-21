package MidExam;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentCount = Integer.parseInt(scanner.nextLine());
        int lecturesCount = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = 0;
        int attendances = 0;

        for (int i = 0; i <studentCount ; i++) {
            int attendancesCount = Integer.parseInt(scanner.nextLine());
            double bonus = Math.ceil((attendancesCount/(lecturesCount*1.0))*(5+initialBonus));
            if (maxBonus<=bonus){
                maxBonus=bonus;
                attendances=attendancesCount;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.",attendances);
    }
}
