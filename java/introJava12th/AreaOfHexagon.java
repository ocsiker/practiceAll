public class AreaOfHexagon {
  public static void main(String[] args) {
    // Create Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Enter side of a hexagon
    System.out.print("Enter side of a hexagon: ");
    double sideOfHexagon = input.nextDouble();

    // Compute Area of Hexagon by formular 3*sqrt(3)/2 * s^2, s--> side of
    // hexagon.
    double areaOfHexagon = Math.pow(3, 1.5) / 2 * Math.pow(sideOfHexagon, 2);

    // Display the area of hexagon
    System.out.println("The area of hexagon is " + (int) (areaOfHexagon * 10000) / 10000.0);

    // close Scanner
    input.close();
  }
}
