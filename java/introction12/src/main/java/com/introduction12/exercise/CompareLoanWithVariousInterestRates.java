public class CompareLoanWithVariousInterestRates {
  public static void main(String[] args) {
    // a increment of interest rate is 1/8
    final double INCREASE_INTEREST_RATE = 0.125;
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter loan amount
    System.out.print("Enter loan amount: ");
    double loanAmount = input.nextDouble();
    // Enter number of years
    System.out.print("Enter number of years: ");
    int years = input.nextInt();
    // interestRateMonthly = interestRate / 12 ;
    // Monthly payment = loanAmount / 60 + (interestMoney )
    // Table show format with printf
    // interest rate
    double interestRate = 5.0;
    double remainLoan = loanAmount;
    System.out.println("Interest Rate" + "    " + "Monthly Payment" + "    " + "Total Payment");
    while (interestRate <= 8.0) {
      double monthlyInterestRate = interestRate / 1200;
      double monthlyPayment = loanAmount * monthlyInterestRate
          / (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
      System.out.printf("%-5.3f%%%11s", interestRate, " ");
      System.out.printf("%-6.2f%13s", monthlyPayment, " ");
      System.out.printf("%-8.2f", monthlyPayment * 12 * years);
      System.out.println();
      interestRate += INCREASE_INTEREST_RATE;// compute interestRate increase
    }
    //

  }
}
