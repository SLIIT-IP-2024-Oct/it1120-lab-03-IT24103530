import java.util.Scanner;

public class IT24103530Lab3Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the price of 1kg of rice
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        // Input the number of kilograms
        System.out.print("Enter the number of kilograms you want to buy: ");
        double numberOfKg = scanner.nextDouble();

        // Calculate the amount to pay
        double totalAmount = pricePerKg * numberOfKg;

        // Output the result
        System.out.println("The amount you have to pay is: " + totalAmount);
    }
}
