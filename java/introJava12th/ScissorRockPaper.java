public class ScissorRockPaper {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Random scissor (0)  rock (1) paper (2)
    int computerDecision = (int) (Math.random() * 3);
    // Prompt the user to
    // Enter your decision
    System.out.print("scissor (0), rock (1), paper (2): ");
    int guess = input.nextInt();

    System.out.print("The computer is ");
    switch (computerDecision) {
      case 0:
        System.out.print("scissor.");
        if (guess == 0) {
          System.out.println(" You are scissor. It is a draw");
        } else if (guess == 1) {

          System.out.println(" You are rock. You won");

        } else {
          System.out.println("You are paper. You lose");
        }
        break;
      case 1:
        System.out.print("rock.");
        if (guess == 0) {
          System.out.print(" You are scissor. ");
          System.out.print("You lose");
        } else if (guess == 1) {

          System.out.println(" You are rock. ");
          System.out.println("It is a draw");

        } else {
          System.out.println("You are paper. ");
          System.out.println("You won");
        }
        break;
      case 2:
        System.out.print("paper.");
        if (guess == 0) {
          System.out.print(" You are scissor. ");
          System.out.println("You won");
        } else if (guess == 1) {

          System.out.println(" You are rock. ");
          System.out.print("You lose");

        } else {
          System.out.println("You are paper. ");
          System.out.println("It is a draw");
        }
        break;
    }
    System.out.print("\n");
    input.close();
  }
}
