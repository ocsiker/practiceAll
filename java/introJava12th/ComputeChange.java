import java.util.Scanner;

public class ComputeChange {
  public static void main(String[] args) {
    // Create a scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user for enter money to change
    System.out.println("Enter amount money to change int dollar, for example 11.56:");
    // receive amount
    double amount = input.nextDouble();
    int remainingAmount = (int) (amount * 100);

    // find number of one dollars
    int numberOfOneDollars = remainingAmount / 100;
    remainingAmount = remainingAmount % 100;

    // Find the number of quarters in the remaining amount
    int numberOfQuarters = remainingAmount / 25;
    remainingAmount = remainingAmount % 25;

    // Find the number of Dimes in the remaining amount
    int numberOfDimes = remainingAmount / 10;
    remainingAmount = remainingAmount % 10;

    // Find the number of nickels in the remaining amount

    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;

    // Find the number of pennies in the remaining amount

    int numberOfPennies = remainingAmount;

    // System.out.println(
    //     "Your amount: "
    //         + amount
    //         + " consist of "
    //         + numberOfOneDollars
    //         + " dollars "
    //         + numberOfQuarters
    //         + " quarters "
    //         + numberOfDimes
    //         + " dimes "
    //         + numberOfNickels
    //         + " nickels "
    //         + numberOfPennies
    //         + " pennies ");

    System.out.println("Your mount: " + amount + " consist of ");
    System.out.println(
        " " + numberOfOneDollars + ((numberOfOneDollars > 1) ? "Dollars" : "Dollar "));
    System.out.println(" " + numberOfQuarters + ((numberOfQuarters > 1) ? "Quarters" : "Quarter"));
    System.out.println(" " + numberOfDimes + ((numberOfDimes > 1) ? "Dimes" : "Dime"));
    System.out.println(" " + numberOfNickels + ((numberOfNickels > 1) ? "Nickels" : "Nickel"));
    System.out.println(" " + numberOfPennies + ((numberOfPennies > 1) ? "Pennies" : "Pennie"));
  }
}
