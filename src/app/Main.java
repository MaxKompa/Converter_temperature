package app;

public class Main {


    public static void main(String[] args) {
        System.out.println("Converter Application");

        double fahrenheit = 98.6;
        double celsius = fahrenheitToCelsius(fahrenheit);

        System.out.println("Result is " + celsius + " celsius.");

    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
