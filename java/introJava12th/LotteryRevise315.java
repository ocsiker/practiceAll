public class LotteryRevise315 {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Generate three-digit integer
    int lotteryNumber = (int) (Math.random() * 1000);

    int lotteryNumber1 = lotteryNumber / 100;
    int lotteryNumber2 = (lotteryNumber / 10) % 10;
    int lotteryNumber3 = lotteryNumber % 10;

    // Prompt the user to
    // Enter guess number
    System.out.print("Enter guess number (0 to 999): ");
    int guessNumber = input.nextInt();
    int guessNumber1 = guessNumber / 100;
    int guessNumber2 = (guessNumber / 10) % 10;
    int guessNumber3 = guessNumber % 10;
    boolean award2 = true;
    boolean award3 = true;

    System.out.print("You're win $");
    if (lotteryNumber == guessNumber) {
      System.out.println("10,000");
    } else if (award2) {
      System.out.println("3,000");
    } else if (award3) {
      System.out.println("1,000");
    } else {
      System.out.println("You're not winner");
    }
  }
}
