public class CountPositiveAndNegativeNumber {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter list integer, the input ends if it is 0
    System.out.print("Enter list integer, the input ends if it is 0: ");
    int number = input.nextInt();
    int positiveNumber = 0;
    int negativeNumber = 0;
    int sum = 0;
    int count = 0; // count number of integers
    if (number == 0) {
      System.out.println("No numbers are entered except 0");
      System.exit(0);
    }
    while (number != 0) {
      sum += number;// Compute total of the integers
      count++;
      positiveNumber += number > 0 ? 1 : 0;// increase positive number if number > 0
      number = input.nextInt();
    }

    // Compute average by (sum of integer divide (total the number integers))
    System.out.println("The number of positives: " + positiveNumber);
    System.out.println("The number of positives: " + (count - positiveNumber));
    System.out.println("The total is: " + sum * 1.0);
    System.out.println("The average is: " + sum * 1.0 / count);
    // Close the input
    input.close();
  }
}
