import java.util.Scanner;

public class ConvertFeetToMeter {
  public static void main(String[] args) {
    // Create Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to input
    // Enter foot value
    System.out.println("Enter value of foot to convert: ");
    double feets = input.nextDouble();

    // Convert to meter
    double meters = feets * 0.305;

    // Display output
    System.out.println(feets + " feet is " + meters + " meters");
    input.close();
  }
}
