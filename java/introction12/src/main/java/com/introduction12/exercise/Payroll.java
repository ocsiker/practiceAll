public class Payroll {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter employee's name:
    System.out.print("Enter employee's name: ");
    String name = input.nextLine();
    // Enter number of hours worked in a week: hoursWorkedPerWeek
    System.out.print("Enter number of hours worked in a week: ");
    int hoursWorkedPerWeek = input.nextInt();
    // Enter hourly pay rate: hourlyPayRate
    System.out.print("Enter hourly pay rate: ");
    double hourlyPayRate = input.nextDouble();
    // Enter federal tax withholding rate: federalTax
    System.out.print("Enter federal tax withholding rate: ");
    double federalTax = input.nextDouble();
    // Enter state tax withholding rate: stateTax
    System.out.print("Enter state tax withholding rate: ");
    double stateTax = input.nextDouble();
    // Deductions :
    // Federall withholding = federalTax * hoursWorkedPerWeek * hourlyPayRate
    // State withholding = stateTax * hoursWorkedPerWeek * hourlyPayRate
    double grossPay = hourlyPayRate * hoursWorkedPerWeek;
    //
    // Display
    System.out.println("Employee Name: " + name);
    System.out.println("Hours Worked: " + hoursWorkedPerWeek);
    System.out.println("Pay Rate: " + hourlyPayRate);
    System.out.printf("Gross Pay: %.2f", (hourlyPayRate * hoursWorkedPerWeek));
    System.out.println("Deductions: ");
    System.out.printf("\t Federal withholding: %.2f\n", (grossPay * federalTax));
    System.out.printf("\t State withholding: %.2f\n", (grossPay * stateTax));
    System.out.printf("\t Total Deductions: %.2f\n", (grossPay * (stateTax + federalTax)));
    System.out.printf("Net pay: %.2f", grossPay - (grossPay * (stateTax + federalTax)));

    // Close the Scanner
    input.close();

  }

}
