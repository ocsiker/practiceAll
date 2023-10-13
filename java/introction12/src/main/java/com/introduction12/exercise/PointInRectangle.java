public class PointInRectangle {
  public static void main(String[] args) {
    // Create final EPSILON = 10-9
    // final double EPSILON= Math.pow(10,-9 );
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    //
    // Prompt the user to
    // Enter point A(pxA ,pyA )
    System.out.print("Enter a piont with two coordinates: ");
    double pxA = input.nextDouble();
    double pyA = input.nextDouble();

    // check in or out of rectangle centered 0(0,0) width = 10 and height = 5
    // validCoorX = pxA >= - width/2 && pxA <= width/2 ;
    // validCoorY = pYA >= - height/2 && pyA <= height/2 ;
    boolean validCoorX = pxA >= -10.0 / 2 && pxA <= 10.0 / 2;
    boolean validCoorY = pyA >= -5.0 / 2 && pyA <= 5.0 / 2;
    // if validCoorY && validCoorY -> A in or on rectangle
    // else A out of rectangle
    boolean valid = validCoorX && validCoorY;

    if (valid) {
      System.out.println("Point is in the rectangle");
    } else {
      System.out.println("Point is not  in the rectangle");

    }
    input.close();
  }
}
