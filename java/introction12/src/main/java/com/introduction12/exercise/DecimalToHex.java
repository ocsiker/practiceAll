public class DecimalToHex {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    //
    // Prompt the user to
    // Enter a decimal value (0 to 15)
    System.out.print("Enter a decimal value (0 to 15): ");
    int number = input.nextInt();

    // Display result
    if (number > 0 && number < 17) {
      System.out.println("The hex value is: " + Integer.toHexString(number).toUpperCase());
    } else {
      System.out.println(number + " is an invalid input");

    }
    // Close the Scanner
    input.close();
  }
}
