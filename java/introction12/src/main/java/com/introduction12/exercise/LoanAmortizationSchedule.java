public class LoanAmortizationSchedule {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter loan amount
    System.out.print("Enter loan amount: ");
    double loanAmount = input.nextDouble();
    // Enter number of years
    System.out.print("Enter number of years: ");
    int mountOfYears = input.nextInt();
    // Enter interest rate
    System.out.print("Enter interest rate: ");
    double interestRate = input.nextDouble();
    // Monthly Interest rate
    double monthlyInterestRate = interestRate / 1200;
    // Monthly payment
    double monthlyPayment = loanAmount * monthlyInterestRate
        / (1 - 1 / Math.pow(1 + monthlyInterestRate, 12 * mountOfYears));
    System.out.printf("Monthly Payment: %7.2f\n", monthlyPayment);
    // Total payment:
    double totalPayment = monthlyPayment * mountOfYears * 12;
    System.out.printf("Total Payment: %9.2f\n", totalPayment);
    // Table Payment# Interest Principal Balance
    System.out.println("Payment#" + "    " + "Interest" + "    " + "Principal" + "    " + "Balance");
    // Balance
    // Principal
    // interest the fist month
    double interest, principal;
    double balance = loanAmount;
    for (int i = 1; i <= 12 * mountOfYears; i++) {
      // interest in monthly
      // interest per month
      interest = monthlyInterestRate * balance;
      // principal
      principal = monthlyPayment - interest;
      // decrease balance after a month with principal not include interest
      balance -= principal;
      System.out.printf("%-3d%-9s", i, " ");
      System.out.printf("%2s%6.2f", " ", interest);
      System.out.printf("%6s%7.2f", " ", principal);
      System.out.printf("%3s%8.2f\n", " ", balance);

    }
  }
}
