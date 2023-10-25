public class FindUnicodeOfCharacter {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Enter a character
    System.out.print("Enter a character: ");
    char ch = input.next().charAt(0);

    // Display output
    System.out.println("The Unicode for the character " + ch + " is: " + (int) ch);
    // Close the Scanner
    input.close();
  }
}
