import java.util.Scanner;

public class SaleTax {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt user for input
    System.out.println("Enter purchase amount:");
    double purchaseAmount = input.nextDouble();

    double tax = purchaseAmount * 0.06;

    //   System.out.println(tax);
    System.out.println("Sales tax is $" + (int) (tax * 100) / 100.0);
    //  System.out.println((int) tax * 100);
    // System.out.println((int) 100.1 + 10.7);
    input.close();
  }
}
