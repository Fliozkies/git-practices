import java.util.Scanner;

public class Prac1 {
    public static void Addition(Scanner scan) {
        System.out.println("---Addition---");
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        System.out.println("The sum is: " + (num1 + num2));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("----------Calculator Menu----------");
            System.out.println("1. Addition");
            System.out.print("\nSelect: ");
            int choice = scan.nextInt();
            scan.nextLine();

            System.out.println();

            switch (choice) {
                case 1:
                    Addition(scan); break;
                case 5:
                    System.out.println("Exiting the program.");
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}