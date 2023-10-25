public class AreaOfPolygon {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    //
    // Prompt the user to
    // Enter the side:
    System.out.print("Enter the number of sides: ");
    int n = input.nextInt();
    System.out.print("Enter the side: ");
    double side = input.nextDouble();

    //
    // Compute the area of the hexagon by formula: Area = n * side^2 /(4 *
    // tan(pi/n))
    double areaOfPolygon = (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    System.out.print("The area of the hexagon is: ");
    System.out.printf("%.2f", areaOfPolygon);
    // Close the Scanner
    input.close();

  }
}
