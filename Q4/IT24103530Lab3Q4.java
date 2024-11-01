import java.util.Scanner;

public class IT24103530Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        // Extract and print each digit separated by spaces
        int digit1 = number / 10000;
        int digit2 = (number / 1000) % 10;
        int digit3 = (number / 100) % 10;
        int digit4 = (number / 10) % 10;
        int digit5 = number % 10;

        // Output the digits separated by spaces
        System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
    }
}
