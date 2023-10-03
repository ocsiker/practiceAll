public class SolveQuadraticEquations {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Enter values for a b c
    System.out.print("Enter values for a b c:");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();

    double discriminant = Math.pow(b, 2) - 4 * a * c;
    if (discriminant > 0) {
      double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
      double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
      System.out.println(
          "The equation has two roots: "
              + (int) (r1 * 100000) / 100000.0
              + " and "
              + (int) (r2 * 100000) / 100000.0);
    } else if (discriminant == 0) {
      double r = (-b) / (2 * a);
      System.out.println("The equation has root: " + (int) (r * 100000) / 100000.0);
    } else {
      System.out.println("The equation has no real roots");
    }

    // Close input
    input.close();
  }
}
