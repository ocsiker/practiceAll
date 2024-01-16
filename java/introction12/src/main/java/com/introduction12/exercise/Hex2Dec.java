public class Hex2Dec {
  /**
   * Main method
   */
  public static void main(String[] args) {

    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to enter
    System.out.print("Enter a hex number: ");
    String hexStr = input.next();

    // Print value convert to screen
    System.out.println("The hex number " + hexStr + " to decimal is: " + hexToDecimal(hexStr.toUpperCase()));
    // Close the input stream
    input.close();
  }

  /**
   * hexToDecimal method
   */
  public static int hexToDecimal(String hexStr) {
    int decimalValue = 0;
    for (int pos = 0; pos < hexStr.length(); pos++) {
      char c = hexStr.charAt(pos);
      // Horner's algorithm page 243/1717 introduction to java Y. Daniel
      decimalValue = decimalValue * 16 + hexCharToDecimal(c);
    }
    return decimalValue;
  }

  /**
   * hexCharToDecimal method
   */
  public static int hexCharToDecimal(char c) {
    if (c >= '1' && c <= '9') {
      return c - '0';// 48 equivalen 0's character'
      //
    } else if (c >= 'A' && c <= 'F') {
      return c - 'A' + 10; // 65 equivalen the character A and plus 10 to make A has value 10
    } else {
      System.out.println("Range number not in hexadecimal ");
      System.exit(-1);
      return -1;// error
    }
  }
}
