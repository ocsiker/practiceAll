public class DistanceOfTwoPoints {
  public static void main(String[] args) {
    // Create scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Enter value point X1
    System.out.print("Enter value point X1(x1, y1): ");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    // Enter value point X2
    System.out.print("Enter value point X2(x2, y2): ");
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();

    // Compute the distance between X1 and X2 by formular sqrt((x2-x1)^2 +
    // (y2-y1)^2)

    double distanceOfTwoPoints = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);

    // Display distance of two points
    //
    System.out.println("The distance between the two points is: " + distanceOfTwoPoints);
    // close input
    input.close();
  }
}
