public class PalindromeInteger {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Enter a three-digit integer
    System.out.print("Enter a three-digit integer: ");

    int threeDigitInteger = input.nextInt();

    if (threeDigitInteger % 10 == (threeDigitInteger / 100)) {
      System.out.println("The " + threeDigitInteger + " is palindrome integer");
    } else {
      System.out.println("The " + threeDigitInteger + " is not palindrome integer");
    }

    input.close();
  }
}
