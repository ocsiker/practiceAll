public class ComputeTax {
  public static void main(String[] args) {
    // Create Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Enter the filing status
    // and taxable income
    System.out.println("Enter the filing status: ");
    System.out.println("0 - for single filers");
    System.out.println("1 - for married filing jointly or qualified widow(er)");
    System.out.println("2 - for married filing seperately ");
    System.out.println("3 - for head household");
    int status = input.nextInt();
    // Enter income
    System.out.println("Enter the taxable income: ");
    double income = input.nextDouble();
    // Create Tax rate percent
    final double TAX_RATE_LEVEL_1 = 0.1;
    final double TAX_RATE_LEVEL_2 = 0.15;
    final double TAX_RATE_LEVEL_3 = 0.25;
    final double TAX_RATE_LEVEL_4 = 0.28;
    final double TAX_RATE_LEVEL_5 = 0.33;
    final double TAX_RATE_LEVEL_6 = 0.35;

    // Check status and compute tax depend on income
    // 2009 U.S. Federal Personal tax rates
    //
    double tax = 0;
    if (status == 0) {
      System.out.println("single filers");
      if (income < 8351) {
        tax = income * TAX_RATE_LEVEL_1;
      } else if (income < 33951) {
        tax = 8350 * TAX_RATE_LEVEL_1 + (income - 8350) * TAX_RATE_LEVEL_2;
      } else if (income < 82251) {
        tax =
            8350 * TAX_RATE_LEVEL_1
                + (33950 - 8350) * TAX_RATE_LEVEL_2
                + (income - 33950) * TAX_RATE_LEVEL_3;
      } else if (income < 171551) {
        tax =
            8350 * TAX_RATE_LEVEL_1
                + (33950 - 8350) * TAX_RATE_LEVEL_2
                + (82250 - 33950) * TAX_RATE_LEVEL_3
                + (income - 82250) * TAX_RATE_LEVEL_4;
      } else if (income < 372951) {
        tax =
            8350 * TAX_RATE_LEVEL_1
                + (33950 - 8350) * TAX_RATE_LEVEL_2
                + (82250 - 33950) * TAX_RATE_LEVEL_3
                + (171550 - 82250) * TAX_RATE_LEVEL_4
                + (income - 171550) * TAX_RATE_LEVEL_5;
      } else {
        tax =
            8350 * TAX_RATE_LEVEL_1
                + (33950 - 8350) * TAX_RATE_LEVEL_2
                + (82250 - 33950) * TAX_RATE_LEVEL_3
                + (171550 - 82250) * TAX_RATE_LEVEL_4
                + (372950 - 171550) * TAX_RATE_LEVEL_5
                + (income - 372950) * TAX_RATE_LEVEL_6;
      }
    } else if (status == 1) {
      System.out.println("married filing jointly or qualified widow(er)");
      if (income < 16701) {
        tax = income * TAX_RATE_LEVEL_1;
      } else if (income < 67901) {
        tax = 16700 * TAX_RATE_LEVEL_1 + (income - 16700) * TAX_RATE_LEVEL_2;
      } else if (income < 137051) {
        tax =
            16700 * TAX_RATE_LEVEL_1
                + (67900 - 16700) * TAX_RATE_LEVEL_2
                + (income - 67900) * TAX_RATE_LEVEL_3;
      } else if (income < 208851) {
        tax =
            16700 * TAX_RATE_LEVEL_1
                + (67900 - 16700) * TAX_RATE_LEVEL_2
                + (137050 - 67900) * TAX_RATE_LEVEL_3
                + (income - 137050) * TAX_RATE_LEVEL_4;
      } else if (income < 372951) {
        tax =
            16700 * TAX_RATE_LEVEL_1
                + (67900 - 16700) * TAX_RATE_LEVEL_2
                + (137050 - 67900) * TAX_RATE_LEVEL_3
                + (208850 - 137050) * TAX_RATE_LEVEL_4
                + (income - 208850) * TAX_RATE_LEVEL_5;
      } else {
        tax =
            16700 * TAX_RATE_LEVEL_1
                + (67900 - 16700) * TAX_RATE_LEVEL_2
                + (137050 - 67900) * TAX_RATE_LEVEL_3
                + (208850 - 137050) * TAX_RATE_LEVEL_4
                + (372950 - 208850) * TAX_RATE_LEVEL_5
                + (income - 372950) * TAX_RATE_LEVEL_6;
      }
    } else if (status == 2) {
      System.out.println("married filing seperately");
      if (income < 11951) {
        tax = income * TAX_RATE_LEVEL_1;
      } else if (income < 45501) {
        tax = 11950 * TAX_RATE_LEVEL_1 + (income - 11950) * TAX_RATE_LEVEL_2;
      } else if (income < 117451) {
        tax =
            11950 * TAX_RATE_LEVEL_1
                + (45500 - 11950) * TAX_RATE_LEVEL_2
                + (income - 45500) * TAX_RATE_LEVEL_3;
      } else if (income < 190201) {
        tax =
            11950 * TAX_RATE_LEVEL_1
                + (45500 - 11950) * TAX_RATE_LEVEL_2
                + (117450 - 45500) * TAX_RATE_LEVEL_3
                + (income - 117450) * TAX_RATE_LEVEL_4;
      } else if (income < 372951) {
        tax =
            11950 * TAX_RATE_LEVEL_1
                + (45500 - 11950) * TAX_RATE_LEVEL_2
                + (117450 - 45500) * TAX_RATE_LEVEL_3
                + (190200 - 117450) * TAX_RATE_LEVEL_4
                + (income - 190200) * TAX_RATE_LEVEL_5;
      } else {
        tax =
            11950 * TAX_RATE_LEVEL_1
                + (45500 - 11950) * TAX_RATE_LEVEL_2
                + (117450 - 45500) * TAX_RATE_LEVEL_3
                + (190200 - 117450) * TAX_RATE_LEVEL_4
                + (372950 - 190200) * TAX_RATE_LEVEL_5
                + (income - 372950) * TAX_RATE_LEVEL_6;
      }
    } else {
      System.out.println("Wrong status");
      System.exit(1);
    }

    System.out.println("The tax is: " + tax);
    input.close();
  }
}
