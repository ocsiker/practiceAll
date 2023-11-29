public class BitLevelOperations {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to enter
    // Enter an integer
    System.out.print("Enter an integer: ");
    short number = input.nextShort();
    //
    String bits = "";
    for (int i = 0; i < 16; i++) {
      bits = (number & 1) + bits;
      number = (short) (number >> 1);
    }

    System.out.println("The bits are: " + bits);
  }
}
