public class CornerPointCoordinates {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Enter the radius of the bounding circle :
    System.out.print("Enter the radius of the bounding  circle :");
    double radius = input.nextDouble();

    // Compute five point of pentagon with one point at the 0 o'clock
    // rectangle from two points and center at center is 360/5 = 72
    // --------------- p1
    //
    // -------p3---------------- p1
    //
    // -------p4---------------- p5
    // ==> recOfP1 = 90 - 72 = 18
    // ==> recOfP2 = recOfP1 + 72 = 90
    // ==> recOfP3 = recOfP1 + 72 * 2 = 162
    // ==> recOfP4 = recOfP1 + 72 * 3 = 234
    // ==> recOfP5 = recOfP1 + 72 * 4 = 306

    // xi yi corresponding pi

    double x1 = radius * Math.cos(Math.toRadians(18));
    double y1 = radius * Math.sin(Math.toRadians(18));

    double x2 = radius * Math.cos(Math.toRadians(90));
    double y2 = radius * Math.sin(Math.toRadians(90));

    double x3 = radius * Math.cos(Math.toRadians(162));
    double y3 = radius * Math.sin(Math.toRadians(162));

    double x4 = radius * Math.cos(Math.toRadians(234));
    double y4 = radius * Math.sin(Math.toRadians(234));

    double x5 = radius * Math.cos(Math.toRadians(306));
    double y5 = radius * Math.sin(Math.toRadians(306));

    System.out.println("The coordinates of five points on the pentagon are : ");
    System.out.printf("( %.2f, %.2f) \n ", x1, y1);
    System.out.printf("( %.2f, %.2f) \n ", x2, y2);
    System.out.printf("( %.2f, %.2f) \n ", x3, y3);
    System.out.printf("( %.2f, %.2f) \n ", x4, y4);
    System.out.printf("( %.2f, %.2f) \n ", x5, y5);

  }
}
