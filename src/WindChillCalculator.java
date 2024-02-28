import java.util.Scanner;

public class WindChillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for temperature and wind speed
        System.out.print("Enter the temperature in Fahrenheit (-58°F to 41°F): ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed in miles per hour (should be above 2 mph): ");
        double windSpeed = scanner.nextDouble();

        // Validate user input
        if (temperature < -58 || temperature > 41 || windSpeed <= 2) {
            System.out.println("Error: Invalid input values. Please ensure temperature is between -58°F and 41°F, and wind speed is above 2 mph.");
        } else {
            // Calculate wind-chill temperature
            double windChill = calculateWindChill(temperature, windSpeed);

            // Display wind-chill temperature
            System.out.println("Wind-chill temperature: " + windChill + "°F");
        }

        scanner.close();
    }

    // Method to calculate wind-chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
    }
}
