import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method to convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // Method to convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    // Method to convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Method to convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature value
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        // Input current unit
        System.out.print("Enter the current unit (C/F/K): ");
        char currentUnit = scanner.next().toUpperCase().charAt(0);

        // Input target unit
        System.out.print("Enter the target unit (C/F/K): ");
        char targetUnit = scanner.next().toUpperCase().charAt(0);

        double convertedTemperature = 0;

        // Conversion logic
        switch (currentUnit) {
            case 'C':
                if (targetUnit == 'F') {
                    convertedTemperature = celsiusToFahrenheit(temperature);
                } else if (targetUnit == 'K') {
                    convertedTemperature = celsiusToKelvin(temperature);
                }
                break;

            case 'F':
                if (targetUnit == 'C') {
                    convertedTemperature = fahrenheitToCelsius(temperature);
                } else if (targetUnit == 'K') {
                    convertedTemperature = fahrenheitToKelvin(temperature);
                }
                break;

            case 'K':
                if (targetUnit == 'C') {
                    convertedTemperature = kelvinToCelsius(temperature);
                } else if (targetUnit == 'F') {
                    convertedTemperature = kelvinToFahrenheit(temperature);
                }
                break;

            default:
                System.out.println("Invalid input.");
                return;
        }

        // Display the result
        System.out.printf("The converted temperature is: %.2f %c%n", convertedTemperature, targetUnit);
    }
}
