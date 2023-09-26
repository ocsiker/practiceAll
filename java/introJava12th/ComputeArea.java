// compute area page 57/1717
import java.clang.*;

/** ComputeArea */
public class ComputeArea {

  public static void main(String[] args) {
    // read radius
    double radius, area;

    // SET radius to 20
    // radius = 20;

    // create instance input from scanner
    Scanner input = new Scanner(System.in);

    // read radius from keyboard
    radius = input.nextDouble();

    // compute area
    area = radius * radius * 3.14159;

    // display area
    System.out.println("This area for the circle of radius:" + radius + " is " + area);

    // close input object
    input.close();
  }
}
