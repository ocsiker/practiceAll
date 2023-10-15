public class CompareCosts {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter weight and price for package 1
    // Enter weight and price for package 2
    System.out.print("Enter weight and price for package 1: ");
    double weight1 = input.nextDouble();
    double price1 = input.nextDouble();

    System.out.print("Enter weight and price for package 2: ");
    double weight2 = input.nextDouble();
    double price2 = input.nextDouble();
    //
    // Compare the cost price per kilogram
    // the lower is better
    if (price1 * weight2 > price2 * weight1) {
      System.out.println("The package 2 is better ");
    } else if (price1 * weight2 == price2 * weight1) {
      System.out.println("Two packages are same price ");
    } else {
      System.out.println("The package 1 is better ");
    }
    // Close the Scanner
    input.close();
  }
}
