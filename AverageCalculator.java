import java.util.Scanner;

// User-defined exception
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class AverageCalculator {

    // Method to calculate average
    public static double calculateAverage(int[] numbers) throws NegativeNumberException {
        int sum = 0;

        for (int num : numbers) {
            if (num < 0) {
                throw new NegativeNumberException("Negative number encountered: " + num);
            }
            sum += num;
        }

        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();

            int[] numbers = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            double average = calculateAverage(numbers);
            System.out.println("Average: " + average);

        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter integers only.");
        }

        scanner.close();
    }
}