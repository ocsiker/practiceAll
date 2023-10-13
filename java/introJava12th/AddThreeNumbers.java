public class AddThreeNumbers {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Generate three numbers to calculate
    int randomNumber = (int)(Math.random() * 1000);
    int a = randomNumber % 10;
    int b = randomNumber / 10 % 10;
    int c = randomNumber / 100 % 10;

    // Show three numbers a b c to compute sum
    // Prompt the user to
    // What is sum of a b c ?
    System.out.print("What is sum of " + a + " " + b + " " + c + " ? ");
    int sum = input.nextInt();
    //

    //
    // Compute sum of a b c
    // Check the result is right
    if (sum == (a + b + c)) {
      System.out.println("You're right!");
    } else {
      System.out.println("You're wrong");
      System.out.println("The sum of " + a + "+ " + b + " + " + c +
                         " is : " + (a + b + c));
    }

    // Close input
    input.close();
  }
}
