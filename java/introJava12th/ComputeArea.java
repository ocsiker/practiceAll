// compute area page 57/1717
import java.util.Scanner;

/** ComputeArea */
public class ComputeArea {

  public static void main(String[] args) throws Exception {
    // read radius
    double radius, area;

    // declare Pi value
    final double PI = 3.14159;

    // SET radius to 20
    // radius = 20;

    // create instance input from scanner
    Scanner input = new Scanner(System.in);

    System.out.println("Input radius value: ");
    // read radius from keyboard
    radius = input.nextDouble();

    // compute area
    area = radius * radius * PI;

    // display area
    System.out.println("This area for the circle of radius:" + radius + " is " + area);

    // close input object
    input.close();
  }
}
