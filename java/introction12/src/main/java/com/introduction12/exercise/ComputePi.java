public class ComputePi {
  public static void main(String[] args) {
    // value of pi
    // pi = 4(1-1/3+1/5-1/7+1/9)
    double sum = 0;
    for (int i = 10000; i < 100000; i += 10000) {
      for (int j = 10000; j > 0; j--) {
        sum += Math.pow(-1, j + 1) * 1.0 / (2 * j - 1);

      }
      System.out.println("Precise of PI with n = " + i + " is: " + 4 * sum);
      // reset sum
      sum = 0;
    }

  }
}
