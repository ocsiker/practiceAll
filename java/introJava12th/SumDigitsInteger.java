import java.util.Scanner;

public class SumDigitsInteger {
  public static void main(String[] args) {
    // Create Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user in number between 0 and 1000
    System.out.println("Enter number between 0 and 1000: ");
    int number = input.nextInt();

    int SumDigitsInteger = 0;
    int remainNumber = 0;
    remainNumber = number;
    // Compute sum digits in integer
    for (int i = 0; i < 3; i++) {
      SumDigitsInteger += remainNumber % 10;
      remainNumber /= 10;
    }

    // Display output
    System.out.println("Sum the digits in " + number + " is " + SumDigitsInteger);
    input.close();
  }
}
