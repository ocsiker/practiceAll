public class PointOnLineSegment {
  public static void main(String[] args) {
    // final double EPSILON = Math.pow(10, -9);
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter three points p0 p1 p2
    // Use formular to identify position of point p2 on line create by two points p0
    // and p1
    System.out.print("Enter three points for p0, p1, and p2: ");
    double px0 = input.nextDouble();
    double py0 = input.nextDouble();
    double px1 = input.nextDouble();
    double py1 = input.nextDouble();
    double px2 = input.nextDouble();
    double py2 = input.nextDouble();
    //
    // (x1-x0) * (y2-y0) - ( x2-x0) * (y1-y0) = value
    // value > 0 of the left side of the line
    // = 0 on the same line
    // < 0 on the right side of the line
    //
    double value = (px1 - px0) * (py2 - py0) - (px2 - px0) * (py1 - py0);
    if (value > 0) {
      System.out.println("p2 is on the left side of the line ");
    } else if (value < 0) {

      System.out.println("p2 is on the right side of the line");

    } else {
      // Check px2 is in between from px0 to px1
      if ((px2 > px1 && px2 < px0) || (px2 > px0 && px2 < px1)) {
        System.out.println("( " + px2 + ", " + py2 + ") is on the line segment from " + "(" + px0 + ", " + py0 + " ) "
            + "(" + px1 + ", " + py1 + ")");
      } else {

        System.out
            .println("( " + px2 + ", " + py2 + ") is not  on the line segment from " + "(" + px0 + ", " + py0 + " ) ");
      }

      System.out.println("p2 is on the same line");
    }
    // Close the Scanner
    input.close();
  }
}
