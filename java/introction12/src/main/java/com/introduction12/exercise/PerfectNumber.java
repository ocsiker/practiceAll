public class PerfectNumber {
  public static void main(String[] args) {
    // Perfect number is number equal to the sum of the all of its divisors
    // eg 6 = 3 + 2 + 1
    // eg 28 = 14 + 7 + 4 + 1;
    //
    System.out.println("List the perfect number less  than 10000 is: ");
    for (int number = 2; number < 10000; number++) {
      int sumOfDivisors = 0;
      for (int divisor = 1; divisor < number / 2 + 1; divisor++) {
        if (number % divisor == 0) {
          // Sum of all divisors
          sumOfDivisors += divisor;
        }
        if (sumOfDivisors > number) {
          break;
        }
      }

      if (sumOfDivisors == number) {
        System.out.printf("%d  ", number);
      }
    }
  }
}
