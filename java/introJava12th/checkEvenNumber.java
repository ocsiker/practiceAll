import java.util.Scanner;

public class checkEvenNumber {
  public static void main(String[] args) {
    // Create scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to Enter value
    System.out.println("Enter integer value to check even Number or not:");
    int number = input.nextInt();

    if (number % 2 == 0) {
      System.out.println("The number " + number + " is even number ");
    } else {

      System.out.println("The number " + number + " is not even number ");
    }
    input.close();
  }
}
