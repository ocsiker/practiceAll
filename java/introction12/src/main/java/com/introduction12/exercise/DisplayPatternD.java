public class DisplayPatternD {
  public static void main(String[] args) {
    // Create a Scaner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter the side of triangle
    System.out.print("Enter the side of triangle: ");
    int lengthSide = input.nextInt();
    // print the triangle number with length side had entered
    // if horizontalDirection >= verticalDirection print number at position
    // else print blank
    for (int verticalDirection = 1; verticalDirection < lengthSide + 1; verticalDirection++) {
      for (int horizontalDirection = 1; horizontalDirection < lengthSide + 1; horizontalDirection++) {
        if (horizontalDirection >= verticalDirection) {
          System.out.printf("%-2d", horizontalDirection);
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();// make new line for end of vertical direction
    }
    // Close the input
    input.close();
    //
  }

}
