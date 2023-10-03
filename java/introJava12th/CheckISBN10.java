public class CheckISBN10 {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Enter 9 digits to create digit checksum
    System.out.print("Enter the first 9 digits of ISBN as integer: ");
    int nineDigits = input.nextInt();
    //
    // Compute d10 by (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7
    // * 7 + d8 * 8 + d9 * 9) % 11

    int d9 = (int) (nineDigits / Math.pow(10, 0)) % 10;
    System.out.println(d9);
    int d8 = (int) (nineDigits / Math.pow(10, 1)) % 10;
    int d7 = (int) (nineDigits / Math.pow(10, 2)) % 10;
    int d6 = (int) (nineDigits / Math.pow(10, 3)) % 10;
    int d5 = (int) (nineDigits / Math.pow(10, 4)) % 10;
    System.out.println(d5);
    int d4 = (int) (nineDigits / Math.pow(10, 5)) % 10;
    int d3 = (int) (nineDigits / Math.pow(10, 6)) % 10;
    int d2 = (int) (nineDigits / Math.pow(10, 7)) % 10;
    int d1 = (int) (nineDigits / Math.pow(10, 8));
    System.out.println(d1);

    int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

    // Display out put
    // if d10 == 10 display nineDigits + X ex 012345678X
    // else display nineDigits*10 + d10
    System.out.print("The ISBN-10 is ");
    System.out.print("" + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);

    if (d10 == 10) {
      System.out.println("X");
    } else {
      System.out.println(d10);
    }

    input.close();
  }
}
