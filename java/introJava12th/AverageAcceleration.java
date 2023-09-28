public class AverageAcceleration {
  public static void main(String[] args) {
    // Create Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Enter velocity v0 in meter/second
    // Enter velocity v1 in meter/secondg
    // Enter span t in seconds
    System.out.println("Enter velocity v0 v1 in meters/second and span t in seconds:");
    double velocity0 = input.nextDouble();
    double velocity1 = input.nextDouble();
    double t = input.nextDouble();

    // Compute average acceleration
    // a = (v1-v0)/t
    double averageAccerleration = (velocity1 - velocity0) / t;

    System.out.println("The average acceleration is: " + averageAccerleration);
    input.close();
  }
}
