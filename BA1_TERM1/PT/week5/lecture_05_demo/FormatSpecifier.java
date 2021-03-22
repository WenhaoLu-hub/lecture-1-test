import java.util.Scanner;

public class FormatSpecifier {
    public void run() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a decimal value: ");
        if (!scanner.hasNextDouble())
        {
            System.out.println();
        } else
        {
            double valueToBePrinted = scanner.nextDouble();

            System.out.println("Please decimal places required: ");
            double required = scanner.nextDouble();
            // String temp = String.valueOf(required);
            String decimalPlaces = String.valueOf(required).substring(0, 1);
            String format = "%." + decimalPlaces + "f%n";
            System.out.printf(format, valueToBePrinted);
        }
        scanner.close();
    }
}
