
package com.introduction12.exercise;

public class GreatestCommonDivisor {
  /**
   * Main method
   */
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter number 1 and number 2
    System.out.print("Enter number 1 and number 2 to find greatest common divisor: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();

    // Display the result
    System.out.println("The greatest common divisor is: " + gcd(number1, number2));

    input.close();]
  }

  /**
   * greatest common divisor
   */
  public static int gcd(int num1, int num2) {
    int gcd = 1;
    // posiable gcd 2
    int k = 2;
    while (k <= num1 && k <= num2) {
      if (num1 % k == 0 && num2 % k == 0) {
        // update gcd
        gcd = k;
      }
      k++;
    }
    return gcd;
  }
}
