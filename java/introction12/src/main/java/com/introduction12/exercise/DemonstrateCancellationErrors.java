public class DemonstrateCancellationErrors {
  public static void main(String[] args) {
    // members of sum
    int n = 5000;
    // the sum = 1 + 1/2 + 1/3 + ... + 1/n
    double sum = 0;
    for (int i = 5000; i > 0; i--) {
      sum += 1.0 / i;
    }

    // Display result if plus from right to left of expression
    System.out.printf("From right to left: %.16f\n", sum);
    // reset sum
    sum = 0;
    for (int i = 1; i < 5001; i++) {
      sum += 1.0 / i;
    }
    // Display result if plus from left to right of expression
    System.out.printf("Left to right: %.16f\n", sum);

  }
}
