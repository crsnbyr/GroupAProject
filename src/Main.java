import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        choiceSelection();
    }

    private static void choiceSelection() {
        while (true) {
            System.out.println("""
                    Hello, which option would you like to select?
                    \t1. Distance Converter
                    \t2. Weight Converter
                    \t3. Money Converter
                    \t4. Exit
                    """);

            int choice = 0;
            if (scan.hasNextInt()) {
                choice = scan.nextInt();
                scan.nextLine();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scan.nextLine();
                continue;
            }
            //This switch just calls a method from each class to do whatever conversion they want.
            switch (choice) {
                case 1:
                    DistanceConverter.convert(scan);
                    break;
                case 2:
                    WeightConversion.weightConverter(scan);
                    break;
                case 3:
                    CurrencyConverter.convert(scan);
                    break;
                case 4:
                    System.out.println("Exiting the converter. Goodbye!");
                    return;
                default:
                    System.out.println("Please choose a valid option (1-4).");
            }
        }
    }
}

