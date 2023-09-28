import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {
  public static void main(String[] args) {
    // Create a scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user for input value celsius
    // Enter value celsius
    System.out.println("Enter value of celsius:");
    double celsius = input.nextDouble();

    // Convert from celsius to fahrenheit
    double fahrenheit = (9.0 / 5) * celsius + 32;

    // print output
    System.out.println(celsius + " celsius " + " = " + fahrenheit + "fahrenheit");
    input.close();
  }
}
