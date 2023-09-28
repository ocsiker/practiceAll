public class FindingRunwayLength {
  public static void main(String[] args) {
    // Create Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Enter velocity (meters/second)
    // acceleration (meters/(second * second))
    System.out.println("Enter speed and acceleration:");
    double velocity = input.nextDouble();
    double acceleration = input.nextDouble();

    // Compute minimum runway length for airplan by velocity * velocity /( 2 *
    // acceleration)
    double minimumRunwayLength = velocity * velocity / (2 * acceleration);

    // Display output surround 3 digits
    System.out.println(
        "The minimum runway length for this airplane is "
            + (int) (minimumRunwayLength * 1000) / 1000.0);

    input.close();
  }
}
