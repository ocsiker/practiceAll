public class ComputeE {
  public static void main(String[] args) {
    int factorial = 1;
    System.out.println("i        e");
    double e = 1.0;
    for (int i = 1; i < 21; i++) {
      factorial *= i;
      e += 1.0 / factorial;
      System.out.printf("%-8d ", i);
      System.out.printf("%.16f\n", e);
    }
  }
}
