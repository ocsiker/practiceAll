// page 62/1717

import java.util.Scanner;

public class ComputeAverage {
  public static void main(String[] args) {
    // Create Scanner object
    Scanner input = new Scanner(System.in);

    double number1, number2, number3;

    // prompt the user to enter three values;
    System.out.println("Enter three numbers: ");
    number1 = input.nextDouble();
    number2 = input.nextDouble();
    number3 = input.nextDouble();

    // compute average
    double average = (number1 + number2 + number3) / 3;

    // show average of three numbers

    System.out.println("The average of " + number1 + number2 + number3 + " is " + average);
    input.close();
  }
}
