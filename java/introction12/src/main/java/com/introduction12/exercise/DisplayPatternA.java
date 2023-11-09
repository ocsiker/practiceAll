public class DisplayPatternA {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter the side of triangle
    System.out.print("Enter the side of triangle: ");
    int lengthSide = input.nextInt();
    // Display the triangle
    // if horizontalSide > verticalSide print blank
    // else print number
    for (int verticalDirection = 1; verticalDirection < lengthSide + 1; verticalDirection++) {
      for (int horizontalDirection = 1; horizontalDirection < lengthSide + 1; horizontalDirection++) {
        if (horizontalDirection > verticalDirection) {
          System.out.print(" ");
        } else {
          System.out.printf("%2d", horizontalDirection);
        }
      }
      System.out.println();// new line for end of verticalDirection
    }
    // Close the input
    input.close();
  }
}
