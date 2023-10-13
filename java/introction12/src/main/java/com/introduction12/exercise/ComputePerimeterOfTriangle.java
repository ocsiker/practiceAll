public class ComputePerimeterOfTriangle {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Input Three edges of triangle
    System.out.print("Enter length of three edges of trianghle : ");

    double edgeA = input.nextDouble();
    double edgeB = input.nextDouble();
    double edgeC = input.nextDouble();

    // Check valid the triangle
    // the valid is the pair of two edges is greater than the remaining edge
    boolean valid = ((edgeA + edgeB) > edgeC) && ((edgeA + edgeC) > edgeB) && ((edgeC + edgeB) > edgeA);
    // If valid print perimeter compute by (edgeA + edgeB + edgeC) divide 3
    // else print not triangle
    // suggestion the pair of two edges is greater than the remaining edge
    //
    if (valid) {
      System.out.println("The perimeter of triangle is : " + (edgeC + edgeA + edgeB) / 3);
    } else {

      System.out.println("This is not triangle: ");
      System.out.println("The triangle is the pair of two edges is greater than the remaining edge");
    }
    // Close input - Scanner
    input.close();
  }
}
