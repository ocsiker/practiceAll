public class CompoundValue {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to enter
    // An amount per month
    System.out.print("Enter a mount each month: ");
    double amountEachMonth = input.nextDouble();
    // interest rate per year
    System.out.print("Enter interest per year (percent eg: 5): ");
    double interestPerYear = input.nextDouble();
    // the number of months
    System.out.print("Enter the number of months: ");
    int numberOfMonths = input.nextInt();

    double interestPerMonth = interestPerYear / 1200;
    double amountOfSaving = 0;
    for (int i = 0; i < numberOfMonths; i++) {
      amountOfSaving = (amountEachMonth + amountOfSaving) * (1 + interestPerMonth);
    }

    System.out.printf("The amount of saving is: %.4f", amountOfSaving);
    // Close the Scanner

    input.close();
  }
}
