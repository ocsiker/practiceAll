public class LotteryUsingStrings {
  public static void main(String[] args) {
    // Create a Scanner

    java.util.Scanner input = new java.util.Scanner(System.in);
    // Create a lottery as two-digit string
    String lottery = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10);
    // Prompt the user to Enter a guess
    // Display lottery
    System.out.println("The lottery number is :" + lottery);
    System.out.print("Enter your lottery pick (two digits): ");
    String guess = input.nextLine();
    //

    // Get digits fromm lottery
    char lotteryDigit1 = lottery.charAt(0);
    char lotteryDigit2 = lottery.charAt(1);
    // Get digits fromm guess
    char guessDigit1 = guess.charAt(0);
    char guessDigit2 = guess.charAt(1);

    // Requirements for win $3000
    boolean isWin10k = lotteryDigit1 == guessDigit1 && lotteryDigit2 == guessDigit2;
    boolean isWin3k = (lotteryDigit1 == guessDigit2) && (lotteryDigit2 == guessDigit1);
    boolean isWin1k = (lotteryDigit1 == guessDigit2) || (lotteryDigit1 == guessDigit1) || (lotteryDigit2 == guessDigit1)
        || (lotteryDigit2 == guessDigit2);

    // Check the guess
    if (isWin10k) {
      System.out.println("Math all digits: you win $10,000");
    } else if (isWin3k) {
      System.out.println("Math all digits: you win $3,000");
    } else if (isWin1k) {
      System.out.println("Math all digits: you win $1,000");
    } else {
      System.out.println("Sorry, no match");
    }

    // Close the Scanner
    input.close();

  }
}
