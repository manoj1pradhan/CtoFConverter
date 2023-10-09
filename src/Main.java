import java.util.Scanner;
class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        while (true) {
            System.out.print("Enter temperature in Celsius: ");

            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();

                fahrenheit = (celsius * 9/5) + 32;

                System.out.println("Equivalent temperature in Fahrenheit: " + fahrenheit + " °F");

                if (celsius == 0) {
                    System.out.println("This is the freezing point of water.");
                } else if (celsius == 100) {
                    System.out.println("This is the boiling point of water.");
                }

                break;
            } else {
                System.out.println("Invalid input. Please enter a valid temperature.");
                scanner.next();
            }
        }

        scanner.close();
    }
}
