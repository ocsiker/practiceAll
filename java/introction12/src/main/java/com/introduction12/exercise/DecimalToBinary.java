public class DecimalToBinary {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to enter
    // Enter the decimal integer to convert to binary value
    System.out.print("Enter the decimal integer to convert to binary value: ");
    int decimalNumber = input.nextInt();
    System.out.print("The decimal integer " + decimalNumber);

    String decimalTobinary = "";
    int remain = 0;
    while (decimalNumber > 0) {
      remain = decimalNumber % 2;
      decimalTobinary = remain + decimalTobinary;
      decimalNumber /= 2;
    }
    System.out.println(" to binary number is : " + decimalTobinary);
  }
}
