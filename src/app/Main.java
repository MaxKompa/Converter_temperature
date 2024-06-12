package app;

public class Main {


    public static void main(String[] args) {
        System.out.println("Converter Application");

        double fahrenheit = 98.6;
        double celsiusConverted = fahrenheitToCelsius(fahrenheit);

        double celsius = 37;
        double fahrenheitConverted = celsiusToFahrenheit(celsius);

        System.out.println("Result is " + celsiusConverted + " celsius and " + fahrenheitConverted + " fahrenheit");

    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
}
