public class PrimeNumberMethod {
  /**
   * Main method
   */
  public static void main(String[] args) {
    System.out.println("The first 50 prime numbers are ");
    printPrimeNumbers(50);
  }

  /**
   * printPrimeNumbers method
   */
  public static void printPrimeNumbers(int numberOfPrimes) {
    final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
    int count = 0; // Count the number of prime numbers
    int number = 2; // A number to be test for primeness

    // Repeatly find prime numbers
    while (count < numberOfPrimes) {
      if (isPrime(number)) {
        count++; // Increase the count
        if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
          // Print the number and advance the new line
          System.out.printf("%-5d\n", number);
        } else {
          // Print the number
          System.out.printf("%-5d", number);
        }
      }
      // Check whether the next number is prime
      number++;
    }
  }

  /**
   * isPrime method
   */
  public static boolean isPrime(int number) {
    if (number < 2) {
      return false;
    }

    for (int divisor = 2; divisor <= number / 2; divisor++) {
      if (number % divisor == 0) {
        return false;
      }
    }
    return true;
  }
}
