import java.util.Scanner;

public class ComputeLoan {
  public static void main(String[] args) {
    // Create a scanner
    Scanner input = new Scanner(System.in);

    // Enter annuual interest rate in percentage, e.eg 3.45
    System.out.println("Enter annual interest rate, e.g., 7.25");
    double annualInterestRate = input.nextDouble();

    // Enter number of years
    System.out.println("Enter number of years, e.g., 5");
    int numberOfYears = input.nextInt();

    // Enter loan amount
    System.out.println("Enter loan amount, e.g., 20401.43");
    double loanAmount = input.nextDouble();

    // convert interest annual to monthly

    double monthlyInterestRate = annualInterestRate / 1200;

    // formular to calculator payment monthly
    double monthlyPayment =
        (loanAmount * monthlyInterestRate)
            / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
    // total payment
    double totalPayment = monthlyPayment * numberOfYears * 12;

    // output monthlyPayment
    System.out.println("Monthly payment: " + (int) (monthlyPayment * 100) / 100.0);
    // output total payment
    System.out.println("Monthly payment: " + (int) (totalPayment * 100) / 100.0);

    // close input
    input.close();
  }
}
