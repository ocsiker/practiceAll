import java.util.Scanner;

public class FahrenheitToCelsius {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // prompt user for input
    System.out.println("Input value Fahrenheit to convert: ");
    double fahrenheit = input.nextDouble();

    double celsius = 5.0 / 9 * (fahrenheit - 32);
    System.out.println("Fahrenheit" + fahrenheit + " is " + celsius + "celsius");

    input.close();
  }
}
