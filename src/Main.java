import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        System.out.println("Enter a series of integers (press Enter to calculate):");

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break; // Exit the loop when the user presses Enter.
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
                count++;
                largest = Math.max(largest, number);
                smallest = Math.min(smallest, number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        scanner.close();

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average: " + average);
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
        } else {
            System.out.println("No valid integers entered.");
        }
    }
}
