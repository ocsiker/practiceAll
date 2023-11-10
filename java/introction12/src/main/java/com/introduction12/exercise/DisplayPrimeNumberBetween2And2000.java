public class DisplayPrimeNumberBetween2And2000 {
  public static void main(String[] args) {
    // Display prime numbers between 2 and 2000
    // Loop from 2 to 2000
    int count = 0;
    for (int number = 2; number < 2001; number++) {
      boolean isPrime = true;
      // Check number is prime
      for (int divisor = 2; divisor <= number / 2; divisor++) {
        if (number % divisor == 0) {
          isPrime = false;
          break;
        }
      }

      if (isPrime) {
        count++;
        // guaranti 8 numbers per line
        if (count == 8) {
          System.out.print(number + " ");// print prime number and break line
          count = 0;// reset count
          System.out.println();
        } else {
          System.out.print(number + " ");// print prime number
        }

      }
    }
  }
}
