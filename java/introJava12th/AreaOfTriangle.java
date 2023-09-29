public class AreaOfTriangle {
  public static void main(String[] args) {
    // Create Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Enter the coordinates of three point separated by spaces
    System.out.print(
        "Enter the coordinates of three point separated by spaces in order x1 y1 x2 y2 x3 y3 : ");
    // Get coordinates X1
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    // Get coordinates X2
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    // Get coordinates X3
    double x3 = input.nextDouble();
    double y3 = input.nextDouble();
    // Compute side between a(x1,y1) and b(x2,y2) on formular
    // sqrt((x2-x1)^2+(y2-y1)^2)
    // side1 between X1 and X2
    double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
    // side2 between X2 and X3
    double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
    // side3 between X3 and X1
    double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);

    // Average of three sides
    // averageThreeSides = (side1 + side2 + side3)/2;

    double averageThreeSides = (side1 + side2 + side3) / 2;

    // Compute area of triangle by
    // sqrt(averageThreeSides*(averageThreeSides-side1)*(averageThreeSides-side2)*(averageThreeSides-side3))
    double areaOfTriangle =
        Math.pow(
            averageThreeSides
                * (averageThreeSides - side1)
                * (averageThreeSides - side2)
                * (averageThreeSides - side3),
            0.5);

    // Display The area of triangle surrounded by one digit
    System.out.println("The area of triangle " + (int) (areaOfTriangle * 10) / 10.0);
    // close input
    input.close();
  }
}
