public class DisplayPatternC {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter lenght of side
    System.out.print("Enter lenght of side: ");
    int lengthSide = input.nextInt();
    // verticalDirection
    // else print blank
    for (int verticalDirection = 1; verticalDirection < lengthSide + 1; verticalDirection++) {
      // print the elements with value decrease after a vertical direction increase
      for (int horizontalDirection = 1; horizontalDirection < lengthSide + 1; horizontalDirection++) {
        if (horizontalDirection > lengthSide - verticalDirection) {
          System.out.printf("%-2d ", lengthSide - horizontalDirection + 1);
        } else {
          System.out.printf("%-2s ", " ");
        }
      }
      System.out.println();
    }
    // Close the input
    input.close();
  }
}
