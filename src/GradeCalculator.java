import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
        int totalSum = 0;
        int numOfScores = 0;

        System.out.println("Enter scores (enter a negative number to stop):");

        while (true) {
            System.out.print("Enter a score: ");
            int score = scanner.nextInt();

            if (score < 0) {
                break;
            } else if (score > 100) {
                System.out.println("Invalid score! Please enter a score between 0 and 100.");
                continue;
            }

            totalSum += score;
            numOfScores++;
        }

        scanner.close();

        if (numOfScores > 0) {
            double average = (double) totalSum / numOfScores;
            System.out.println("Average score: " + average);

            if (average > 90) {
                System.out.println("Excellent Work!");
            } else if (average > 80) {
                System.out.println("Good Job!");
            } else if (average > 70) {
                System.out.println("Keep it up!");
            } else {
                System.out.println("Let's work hard to get those grades up!");
            }
        } else {
            System.out.println("No scores entered.");
        }
    }
}