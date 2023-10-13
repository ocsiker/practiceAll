public class HeadOrTail {
  public static void main(String[] args) {
    // Radom number between 0 and 1
    int random0Or1 = (int) (Math.random() * 2);
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // System.out.println("random is " + random0Or1);
    // Prompt the user to
    // Enter a guess (e.g. 0 or 1)
    System.out.print("Enter a guess (e.g. 0 or 1): ");
    int guess = input.nextInt();

    if (random0Or1 == guess) {
      System.out.println("You're correct!");
    } else {

      System.out.println("You're not correct!");
    }
    input.close();
  }
}
