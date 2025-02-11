import java.util.Scanner;

public class FibonacciMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose an option:");
        System.out.println("1. Fibonacci Iterative");
        System.out.println("2. Fibonacci Recursive");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                fibonacciIterative(scanner);
                break;
            case 2:
                fibonacciRecursive(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
                break;
        }
        
        scanner.close();
    }



    public static void fibonacciIterative(Scanner scanner) {
        int a = 0;
        int b = 1;

        System.out.print("Enter the number of Fibonacci numbers to print: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        } else if (n == 1) {
            System.out.println("Fibonacci number: 0");
            return;
        } else if (n == 2) {
            System.out.println("Fibonacci numbers: 0 1");
        }

        System.out.print("Fibonacci numbers: " + a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
            System.out.print(temp + " ");
        }
        System.out.println(); 
    }


    
    public static void fibonacciRecursive(Scanner scanner) {
        System.out.print("Enter the position of Fibonacci number to find: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0; 
        } else if (n == 1) {
            return 1; 
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); 
        }
    }
}