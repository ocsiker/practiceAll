public class PointInTriangle {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    //
    // Prompt the user to
    // Enter an point to check in or out triangle
    System.out.print("Enter a point's x- and y- coordinates: ");
    double x = input.nextDouble();
    double y = input.nextDouble();
    // create by line cross two point (200,0) and (0.100) and two coordinates ox, oy
    //
    // to check point (x, y) in triangle
    // x*200 >= 0 && y * 100 >= 0 && 1 * x + 2 * y >= 200
    boolean isInTriagle = x * 200 >= 0 && y * 100 >= 0 && 1 * x + 2 * y <= 200;
    if (isInTriagle) {
      System.out.println("The point is in the triangle");
    } else {
      System.out.println("The point is out the triangle");
    }
    input.close();
  }
}
