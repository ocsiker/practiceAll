public class ComputeCDValue {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to enter
    // Enter the initial deposit amount:
    System.out.print("Enter the initial deposit amount: ");
    double initialDepositAmount = input.nextDouble();
    // Enter annual percentage yield:
    System.out.print("Enter annual percentage yield: ");
    double annualPercentageYield = input.nextDouble();
    // Enter maturity period (number of months):
    System.out.print("Enter maturity period (number of months): ");
    int maturityPeriod = input.nextInt();

    // Display the result
    System.out.printf("%-9s%-10s\n", "Month", "CD Value");

    double worthOfCD = initialDepositAmount;
    for (int i = 1; i <= maturityPeriod; i++) {
      // Compute worth of CD after each month
      worthOfCD += worthOfCD * annualPercentageYield / 1200;

      System.out.printf("%-9d%-10.2f\n", i, worthOfCD);

    }
    //
  }
}
