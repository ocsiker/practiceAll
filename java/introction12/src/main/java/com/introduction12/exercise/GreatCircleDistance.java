public class GreatCircleDistance {
  public static void main(String[] args) {
    // RADIUS OF THE EARTH
    final double RADIUS = 6371.01;
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Enter point 1 (latitude and longitude) in degrees
    // Enter point 2 (latitude and longitude) in degrees
    System.out.print("Enter point 1 (latitude and longitude) in degrees ");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    System.out.print("Enter point 2 (latitude and longitude) in degrees ");
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    // Compute the distance between the two point is
    double distance = RADIUS
        * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1))
            * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1) - Math.toRadians(y2)));
    System.out.println("The distance between the two point is: " + distance + " km");

    // Close the Scanner
    input.close();
  }
}
