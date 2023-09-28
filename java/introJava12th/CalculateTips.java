import java.util.Scanner;

public class CalculateTips {
  public static void main(String[] args) {
    // Create Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user input
    // Enter subtotal  and gratuity rate.
    System.out.println("Enter subtotal and gratuity rate: ");
    double subtotal = input.nextDouble();
    double tipRate = input.nextDouble();

    // Calcuate tips
    double gratuity = subtotal * tipRate / 100;
    double total = subtotal + gratuity;
    System.out.println("The gratuity is " + gratuity + " and total is " + total);
    input.close();
  }
}
