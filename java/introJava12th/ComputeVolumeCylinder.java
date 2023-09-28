import java.util.Scanner;

public class ComputeVolumeCylinder {
  public static void main(String[] args) {
    // Declare Const PI
    final double PI = 3.14159;
    // Create Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to input
    // Enter radius value
    System.out.println("Enter value of radius of cylinder:");
    double radius = input.nextDouble();

    // Enter length of cylinder
    System.out.println("Enter value of length of cylinder:");
    double length = input.nextDouble();

    // Compute area of cylinder
    double area = radius * radius * PI;

    // Compute volume of cylinder
    double volume = area * length;

    // Display output
    System.out.println(
        "The volume of cylinder has "
            + radius
            + " radius and "
            + length
            + " length "
            + " is "
            + volume
            + " volume ");
    input.close();
  }
}
