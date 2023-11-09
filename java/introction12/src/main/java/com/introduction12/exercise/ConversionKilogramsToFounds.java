public class ConversionKilogramsToFounds {
  public static void main(String[] args) {
    // Display the title
    System.out.println("Kilograms   Pounds ");
    // Constant coefficient from Kilogram to pound
    final double KILOGRAM_TO_FOUND = 2.2;
    // Display a table with 100 values
    for (int i = 1; i < 200; i += 2) {
      System.out.printf("%-4d", i);
      System.out.print("    ");
      System.out.printf("%10.1f", i * KILOGRAM_TO_FOUND);
      System.out.println();
    }

  }
}
