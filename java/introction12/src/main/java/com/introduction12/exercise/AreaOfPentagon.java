public class AreaOfPentagon {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter radius of pentagon
    // Compute the area of a pentagon is area = (5*s^2)/(4*tan(pi/5))
    // with s is length of a side s = 2*r*tan(pi/5)
    System.out.print("Enter the radius of pentagon : ");
    double radius = input.nextDouble();

    double s = 2 * radius * Math.sin(Math.PI / 5);

    double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));

    System.out.print("The area of pentagon has radius " + radius + " is: ");
    System.out.printf("%.2f\n", area);

    // Close the Scanner
    input.close();
  }
}
