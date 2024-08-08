import java.util.Scanner;

public class FibonacciProgram {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of terms
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci Series up to " + n + " terms (Iterative):");
        printFibonacciIterative(n);

        System.out.println("\nFibonacci Series up to " + n + " terms (Recursive):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }

        scanner.close();
    }

    // Iterative approach to print Fibonacci series
    public static void printFibonacciIterative(int n) {
        int firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    // Recursive approach to calculate Fibonacci number
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
