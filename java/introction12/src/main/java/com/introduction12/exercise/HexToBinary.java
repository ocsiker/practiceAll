public class HexToBinary {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    //
    // Prompt the user to
    // Enter a hex digit:
    System.out.print("Enter a hex digit: ");
    // Get the Character to convert to binary
    char ch = input.next().toLowerCase().charAt(0);

    // Display result
    if ((ch < 'g' && ch >= 'a') || (ch > '0' && ch <= '9')) {
      System.out.println("The binary value is: " + Integer.toBinaryString(((int) ch)));
    } else {
      System.out.println(ch + " is an invalid input");
    }
    // Close the Scanner
    input.close();
    //
  }
}
