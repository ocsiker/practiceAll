public class DisplayPyramid {
  public static void main(String[] args) {
    // 1 2 3 4 5 6
    // 1
    // 2
    // 3
    // 4
    // 5
    // 6
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter an integer from 1 to 15
    System.out.print("Enter an integer from 1 to 15: ");
    int n = input.nextInt();
    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < 2 * n; j++) {
        //
        // have a 2*n + 1 numbers on a line
        int postPrint = n;
        // print at position n and two side of position n with wide is i-1
        if ((j < n - i + 1) || (j > n + i - 1)) // in range [n-i; n+i] we print numbers out we print blank
        {
          System.out.print("   ");
        } else {
          // print numbers in a line
          if (j < n + 1) {
            // the left side of piramid
            System.out.printf("%3d", (n - j + 1));
          } else {
            // the right side of pyramid
            System.out.printf("%3d", (j - n + 1));
          }
        }
        // int count = 0;
        // // 2*i-2 is elements in a line
        // while (count < 2 * i - 1) {
        // count++;
        // System.out.print(n - j + 1);// print numbers in a line
        // }

      }
      System.out.println();
    }
  }
}
