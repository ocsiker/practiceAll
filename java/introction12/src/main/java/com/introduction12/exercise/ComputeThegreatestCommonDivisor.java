public class ComputeThegreatestCommonDivisor {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter two positive integer number
    System.out.print("Enter two positive integer number: ");
    int n1 = input.nextInt();
    int n2 = input.nextInt();
    // find min of n1 and n2
    int gcd = 1;
    for (int d = Math.min(n1, n2); d > 0; d--) {
      if (n1 % d == 0 && n2 % d == 0) {
        gcd = d;
        break;
      }
    }
    System.out.println("The greatest common divisor is: " + gcd);
    // Close the input
    input.close();
  }
}
