public class DisplayNumbersInPyramid {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter height of pyramid
    System.out.print("Enter height of pyramid: ");
    int heightPyramid = input.nextInt();
    // *****************1
    // **************1**2**1
    // ***********1**2**4**2**1
    // --------------------------
    // 1**2**4**8**16**32**16**8**4**2**1
    // center value is 2^(heightPyramid-1)
    // verticalDirection has value is vertical of heightPyramid - 1
    // ex: heightPyramid = 8 -> verticalDirection = 8-1
    for (int verticalDirection = 0; verticalDirection < heightPyramid; verticalDirection++) {
      // horizontalDirection has 2*heightPyramid-1 on a vertical
      // ex: heightPyramid = 8 -> horizontalDirection = 2 * 8 -1 = 15 (values)
      for (int horizontalDirection = 0; horizontalDirection < 2 * heightPyramid; horizontalDirection++) {
        // if in range horizontalDirection < heightPyramid - verticalDirection ||
        // horizontalDirection > heightPyramid + verticalDirection
        // print blank
        // else if
        if (horizontalDirection < heightPyramid - verticalDirection
            || horizontalDirection > heightPyramid + verticalDirection) {
          System.out.printf("%4s", " ");
        } else {
          //
          if (horizontalDirection <= heightPyramid) {
            // print left side
            System.out.printf("%4d", (int) Math.pow(2, horizontalDirection - heightPyramid + verticalDirection));
          } else {
            // print right side
            //
            System.out.printf("%4d", (int) Math.pow(2, heightPyramid - horizontalDirection + verticalDirection));

          }
          // System.out.print("//");
        }
        //
      }
      System.out.println();
    }
  }
}
