public class ConversionMilesToKilometers {
  public static void main(String[] args) {
    // Declare the constant value from mile to kilometer
    final double MILE_TO_KILOMETER = 1.609;
    // Display a title
    System.out.println("Miles   Kilometers");
    // Show the firt 10 values
    for (int i = 1; i < 11; i++) {
      System.out.printf("%-8d", i);
      System.out.printf("%-8.3f\n", i * MILE_TO_KILOMETER);

    }
    //
  }
}
