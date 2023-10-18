public class HexDigit2Dec {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    System.out.print("Enter a hex digit: ");
    String hexString = input.nextLine();
    if (hexString.length() != 1) {
      System.out.println("You must enter exactly one character");
      System.exit(1);
    }

    char ch = Character.toUpperCase(hexString.charAt(0));
    if (ch >= 'A' && ch <= 'F') {
      int value = ch - 'A' + 10;
      System.out.println("The decimal value for hex digit " + ch + " is " + value);
    } else if (Character.isDigit(ch)) {
      System.out.println("The decimal value for hex digit " + ch + " is " + ch);
    } else {
      System.out.println(ch + " Invalid input ");
    }
    // Close the Scanner
    input.close();
  }
}
