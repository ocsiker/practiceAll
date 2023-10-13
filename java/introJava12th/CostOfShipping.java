import java.util.Scanner;

public class CostOfShipping {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to
    // Enter the weight of the package
    System.out.print("Enter the weight of the package: ");

    double weightOfPackage = input.nextDouble();

    if (weightOfPackage <= 0) {
      System.out.println("Invalid input");
      System.exit(1);
    } else if (weightOfPackage <= 1) {
      System.out.print("The cost of shipping is ");
      System.out.println("3.5");
    } else if (weightOfPackage <= 3) {
      System.out.print("The cost of shipping is ");
      System.out.println("5.5");
    } else if (weightOfPackage <= 10) {
      System.out.print("The cost of shipping is ");
      System.out.println("8.5");
    } else if (weightOfPackage <= 20) {
      System.out.print("The cost of shipping is ");
      System.out.println("10.5");
    } else {
      System.out.println("The package cannot be shipped");
    }

    System.out.println("hello");

    // Close input
    input.close();
  }
}
