public class FindCharacterASCII {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Enter ASCII code:
    System.out.print("Enter an ASCII code: ");
    int chi = input.nextInt();

    // Display output
    if (chi >= 0 && chi <= 127) {
      System.out.println("The character for ASCII cod " + chi + " is : " + (char) chi);
    } else {
      System.out.println("Please in ASCII code in 0 to 127");
    }
    //
    // Close the Scanner
    input.close();
  }
}
