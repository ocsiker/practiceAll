public class CalculateFutureInvestment {
  public static void main(String[] args) {
    // Create Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    //
    // Prompt the user to
    // Enter investment amount
    System.out.print("Enter investment amount: ");
    double investmentAmount = input.nextDouble();
    // Enter annual interest rate
    System.out.print("Enter annual interest rate: ");
    double annualInterestRate = input.nextDouble();
    double monthlyInterestRate = annualInterestRate / 1200;
    // Enter the number of years
    System.out.print("Enter the number of years: ");
    int numberOfYears = input.nextInt();

    // Compute future investment value
    // by investmentAmount * pow((1 + monthlyInterestRate),numberOfYears*12)
    double futureInvestmentValue =
        investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

    // Display furture value surrounded by 2 digits
    System.out.println("Furture value is $" + (int) (futureInvestmentValue * 100) / 100.0);
    // Input close
    input.close();
  }
}
