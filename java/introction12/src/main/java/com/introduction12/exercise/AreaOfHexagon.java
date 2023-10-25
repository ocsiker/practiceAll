public class AreaOfHexagon {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    //
    // Prompt the user to
    // Enter the side:
    System.out.print("Enter the side: ");
    double side = input.nextDouble();

    //
    // Compute the area of the hexagon by formula: Area = 6 * side^2 /(4 *
    // tan(pi/6))
    double areaOfHexagon = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
    System.out.print("The area of the hexagon is: ");
    System.out.printf("%.2f", areaOfHexagon);
    // Close the Scanner
    input.close();

  }
}
