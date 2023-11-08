public class PrimeNumber {
  public static void main(String[] args) {
    final int NUMBER_OF_PRIMES = 50; // number of primes to display
    final int NUMBER_OF_PRIMES_PER_LINE = 10; // display 10 prime numbers per line
    int count = 0; // count the number of prime numbers
    int number = 2; // a number to be test for primeness
    System.out.println("The firts 50 primes are: ");

    // Repeatly find prime numbers
    while (count < NUMBER_OF_PRIMES) {
      boolean isPrimeNumber = true;// flag to check what is prime number
      // Test whether number is prime
      for (int divisor = 2; divisor <= number / 2; divisor++) {
        if (number % divisor == 0) {
          isPrimeNumber = false;// set isPrimeNumber to false
          break;// exit for the loop
        }
      }
      // Display the prime number and increase the count
      if (isPrimeNumber) {
        count++;// increase
        if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
          System.out.println(number);
        } else {
          System.out.print(number + " ");
        }
      }
      /*
       * Use condition operator
       * (count%NUMBER_OF_PRIMES_PER_LINE) ? System.out.println(number + " "):
       * System.out.println(number);
       */

      number++;// the next number to check is prime
    }
  }
}
