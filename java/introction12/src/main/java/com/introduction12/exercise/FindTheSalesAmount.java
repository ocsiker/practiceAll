public class FindTheSalesAmount {
  public static void main(String[] args) {
    final double GOAL_AMOUNT = 30000;
    final double FIRT_RATE = 0.08;
    final double SECOND_RATE = 0.10;
    final double THIRD_RATE = 0.12;

    double commission = GOAL_AMOUNT - 5000;
    double salesAmount = 0;
    double gainCommission = 0;
    while (gainCommission < commission) {
      if (salesAmount < 5000) {
        gainCommission += 0.01 * FIRT_RATE;
      } else if (salesAmount < 10000) {
        gainCommission += 0.01 * SECOND_RATE;
      } else {
        gainCommission += 0.01 * THIRD_RATE;
      }
      salesAmount += 0.01;
    }

    // Display the result
    System.out.println("The number of sales have to generate is : " + salesAmount);
  }
}
