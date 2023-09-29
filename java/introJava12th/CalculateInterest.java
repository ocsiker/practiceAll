public class CalculateInterest {
  public static void main(String[] args) {
    // Create Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Enter balance and annual percentage interest rate
    System.out.print("Enter balance and annual percentage interest rate (e.g. , 3 for 3%):");
    double balance = input.nextDouble();
    double annualInterestRate = input.nextDouble();

    // Compute monthly interest
    // by balance * annualInterestRate / (12 months * 100 percentage)
    double monthlyInterest = balance * annualInterestRate / 1200;

    // Display monthly interest
    System.out.println("The interest is " + (int) (monthlyInterest * 10000) / 10000.0);
    //
    // close input
    input.close();
  }
}
