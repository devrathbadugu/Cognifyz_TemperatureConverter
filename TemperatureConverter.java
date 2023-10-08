import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature you want to convert: ");
        double temperature = scanner.nextDouble();

        System.out.println("Enter the unit of the temperature (C or F): ");
        String unit = scanner.next();

        double convertedTemperature;
        if (unit.equals("C")) {
            convertedTemperature = celsiusToFahrenheit(temperature);
            System.out.println(temperature + " degrees Celsius is equal to " + convertedTemperature + " degrees Fahrenheit.");
        } else if (unit.equals("F")) {
            convertedTemperature = fahrenheitToCelsius(temperature);
            System.out.println(temperature + " degrees Fahrenheit is equal to " + convertedTemperature + " degrees Celsius.");
        } else {
            System.out.println("Invalid unit entered.");
        }

        scanner.close();
    }
}
