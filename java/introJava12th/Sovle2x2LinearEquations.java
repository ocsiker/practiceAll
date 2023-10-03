public class Sovle2x2LinearEquations {
  public static void main(String[] args) {
    // Create a scanner
    //
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Enter a b c d e f of 2x2 linear equations
    // ax + by = e
    // cx + dy = f
    //
    System.out.print("Enter value a b c d e f to solve: ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    double d = input.nextDouble();
    double e = input.nextDouble();
    double f = input.nextDouble();

    double det = a * d - b * c;
    double detX = e * d - b * f;
    double detY = a * f - c * e;

    if (det == 0) {
      System.out.println("The equation has no solution");
    } else {
      double x = detX / det;
      double y = detY / det;
      System.out.println(
          "The solution of equation is x = "
              + (int) (x * 1000000) / 1000000.0
              + ", y = "
              + (int) (y * 1000000) / 1000000.0);
    }

    // Close input
    input.close();
  }
}
