public class DisplayPatternB {
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
      for (int horizontalDirection = 1; horizontalDirection < lengthSide - verticalDirection
          + 2; horizontalDirection++) {
        System.out.printf("%-2d", horizontalDirection);
      }
      System.out.println();
    }
    // Close the input
    input.close();
  }
}
