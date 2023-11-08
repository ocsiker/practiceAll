public class GreatestCommonDivisor {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter number 1 and number 2
    System.out.print("Enter number 1 and number 2 to find greatest common divisor: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    // initial greatest common divisor with = 1
    int gcd = 1;
    // posiable gcd 2
    int k = 2;
    while (k <= number1 && k <= number2) {
      if (number1 % k == 0 && number2 % k == 0) {
        // update gcd
        gcd = k;
      }
      k++;
    }

    // Display the result
    System.out.println("The greatest common divisor is: " + gcd);

  }
}
