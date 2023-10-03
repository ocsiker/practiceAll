public class RandomPoint {
  public static void main(String[] args) {
    // Create a Scanner
    int centerRectangleX = 0;
    int centerRectangleY = 0;
    int width = 100;
    int height = 200;

    // Prompt the user to
    // Enter a width and a height
    double coordinateX = Math.random() * width + (centerRectangleX - width) / 2.0;
    double coordinateY = Math.random() * height + (centerRectangleY - height) / 2.0;

    System.out.println(
        "Random coordinate  x : y "
            + (int) (coordinateX * 10000) / 10000.0
            + " : "
            + (int) (coordinateY * 10000) / 10000.0);
  }
}
