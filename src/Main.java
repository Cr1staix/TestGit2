import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        int c = a + b;
        System.out.println("Sum: " + c);

        if (a < b) {
            c = b - a;
            System.out.println("Difference (b - a): " + c);
        } else if (a > b) {
            c = a - b;
            System.out.println("Difference (a - b): " + c);
        } else {
            System.out.println("Numbers are equal, difference is 0");
        }

        int product = a * b;
        System.out.println("Product: " + product);

        if (b != 0) {
            double quotient = (double) a / b;
            System.out.println("Quotient (a / b): " + quotient);
        } else {
            System.out.println("Cannot divide by zero");
        }

        scanner.close();
    }
}