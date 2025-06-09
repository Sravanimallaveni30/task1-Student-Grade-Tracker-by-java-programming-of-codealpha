 import java.util.ArrayList;
import java.util.Scanner;

public class Studentgradetracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter student grades (type -1 to finish):");

        while (true) {
            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();
            if (grade == -1) break;
            if (grade < 0 || grade > 100) {
                System.out.println("Please enter a valid grade (0–100).");
                continue;
            }
            grades.add(grade);
        }

        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
            return;
        }

        int sum = 0, max = grades.get(0), min = grades.get(0);
        for (int g : grades) {
            sum += g;
            if (g > max) max = g;
            if (g < min) min = g;
        }

        double average = (double) sum / grades.size();

        System.out.println("\n--- Results ---");
        System.out.printf("Average Score: %.2f\n", average);
        System.out.println("Highest Score: " + max);
        System.out.println("Lowest Score: " + min);

        scanner.close(); 
    }
}
