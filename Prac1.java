import java.util.Scanner;

public class Prac1 {
    private static void Calculate(int choice, Scanner scan) {
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("The sum is: " + (num1 + num2));
                break;
            case 2:
                System.out.println("The difference is: " + (num1 - num2));
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("----------Calculator Menu----------");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("5. Exit");
            System.out.print("\nSelect: ");
            int choice = scan.nextInt();
            scan.nextLine();

            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("---Addition---");
                    Calculate(choice, scan); break;
                case 2:
                    System.out.println("---Subtraction---");
                    Calculate(choice, scan); break;
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