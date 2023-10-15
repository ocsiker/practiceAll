public class CurrencyExchange {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter the exchange rate from dollars to RMB:
    // Enter 0 to convert dollars to RMB and 1 vice versa:
    // Enter the dollar mount:
    System.out.print("Enter the exchange rate from dollars to RMB: ");
    double rateFromDollarToRMB = input.nextDouble();
    System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
    int chose = input.nextInt();
    if (chose == 0) {
      System.out.print("Enter the dollar mount: ");
      double dollar = input.nextDouble();
      System.out.println("$ " + dollar + " is " + dollar * rateFromDollarToRMB + " yuan");
    } else if (chose == 1) {
      System.out.print("Enter the RMB mount: ");
      double rmb = input.nextDouble();
      System.out.println(rmb + " yuan " + " is $" + (int) (rmb / rateFromDollarToRMB * 1000) / 1000.0);
    } else {
      System.out.println("CIncorrect input");
    }

    // Close Scanner
    input.close();

  }
}
