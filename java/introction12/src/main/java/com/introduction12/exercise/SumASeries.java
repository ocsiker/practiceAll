public class SumASeries {
  public static void main(String[] args) {
    // Show sum of 1/3 + 3/5 + ... + 95/97 + 97/99
    System.out.print("Sum of 1/3 + 3/5 + ... + 95/97 + 97/99");
    double sum = 0;
    for (int i = 99; i > 2; i -= 2) {
      sum += 1.0 * (i - 2) / i;
    }

    System.out.print(" is: " + sum);

  }
}
