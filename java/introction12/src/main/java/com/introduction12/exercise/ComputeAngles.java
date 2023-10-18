public class ComputeAngles {
  public static void main(String[] args) {
    // Create a Scanner
    //
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Promp the user to enter 3 point of rectangle
    System.out.print("Enter three points: ");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    double x3 = input.nextDouble();
    double y3 = input.nextDouble();

    // Compute three sites
    double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
    double c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

    // Compute three angles
    double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
    double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
    double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * b * a)));

    // Display the results
    System.out.println("The three angles are " + Math.round(A * 100) / 100.0 + " : " + Math.round(B * 100) / 100.0
        + " : " + Math.round(C * 100) / 100.0);

    // Close Scanner
    input.close();
  }
}
