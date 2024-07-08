import java.util.Random;
import java.util.Scanner;

public class DieRollar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int throwCount = 0;

        do {
            throwCount++;
            int die1 = random.nextInt(6) + 1;  // random number between 1 and 6
            int die2 = random.nextInt(6) + 1;
            int die3 = random.nextInt(6) + 1;

            // Check for a triple
            if (die1 == die2 && die1 == die3) {
                System.out.printf("Triple rolled after %d throws:\n", throwCount);
                displayThrow(throwCount, die1, die2, die3);
                break;  // Exit loop if triple is rolled
            } else {
                displayThrow(throwCount, die1, die2, die3);
            }

            // Ask user to continue or quit
            System.out.print("Continue? (y/n): ");
            String input = scanner.nextLine();
            if (!input.equalsIgnoreCase("y")) {
                break;  // Exit loop if user does not want to continue
            }
        } while (true);

        System.out.println("Program ended.");
    }

    // Method to display each throw in a formatted table
    private static void displayThrow(int throwNumber, int die1, int die2, int die3) {
        int sum = die1 + die2 + die3;
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Throw", "Die 1", "Die 2", "Die 3");
        System.out.printf("%-10d %-10d %-10d %-10d (Sum: %d)\n", throwNumber, die1, die2, die3, sum);
        System.out.println();
    }
}