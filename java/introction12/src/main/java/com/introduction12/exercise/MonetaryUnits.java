public class MonetaryUnits {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    //
    // Prompt the user to
    // Enter the dollar mount
    System.out.println("Enter the dollar amount: ");
    String amount = input.nextLine();

    int posDot = amount.indexOf(".");
    int remainingAmount;
    if (posDot == -1) {
      remainingAmount = Integer.parseInt(amount);
    } else {
      if (amount.substring(posDot + 1).length() >= 2) {
        amount = amount.substring(0, posDot) + amount.substring(posDot + 1, posDot + 3);
      } else if (amount.substring(posDot + 1).length() == 1) {
        amount = amount.substring(0, posDot) + amount.substring(posDot + 1) + "0";
      } else {
        amount = amount.substring(0, posDot) + "00";
      }

      remainingAmount = Integer.parseInt(amount);
    }

    System.out.println("The round by 2 digits is: " + remainingAmount);

    input.close();
  }
}
