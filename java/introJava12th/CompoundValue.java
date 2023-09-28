public class CompoundValue {
  public static void main(String[] args) {
    // Create Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Enter monthly saving amount
    System.out.print("Enter monthly saving amount: ");
    double monthlySavingAmount = input.nextDouble();

    double interestRateMonth = 0.05 / 12;
    // Compute account value by (monthly saving amount + account amount ) * (1 +
    // interestRateMonth)
    double accountValueFirstMonth = monthlySavingAmount * (1 + interestRateMonth);
    double accountValueTwoMonth =
        (monthlySavingAmount + accountValueFirstMonth) * (1 + interestRateMonth);
    double accountValueThreeMonth =
        (monthlySavingAmount + accountValueTwoMonth) * (1 + interestRateMonth);
    double accountValueFourMonth =
        (monthlySavingAmount + accountValueThreeMonth) * (1 + interestRateMonth);
    double accountValueFiveMonth =
        (monthlySavingAmount + accountValueFourMonth) * (1 + interestRateMonth);
    double accountValueSixMonth =
        (monthlySavingAmount + accountValueFiveMonth) * (1 + interestRateMonth);
    // Display output surround two digits
    System.out.println(
        "After the sixth month, the account value is $"
            + (int) (accountValueSixMonth * 100) / 100.0);

    // Close Scanner
    input.close();
  }
}
