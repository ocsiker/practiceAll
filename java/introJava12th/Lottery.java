public class Lottery {
  public static void main(String[] args) {
    // Create a Scanner
    //
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Enter two numbers
    System.out.println("Enter a guess (e.g) 4 8");
    int number1 = input.nextInt();
    int number2 = input.nextInt();

    int result1 = (int) (Math.random() * 10);
    int result2 = (int) (Math.random() * 10);
    // int result1 = 4;
    // int result2 = 8;

    boolean award1 = (number1 == result1) && (number2 == result2);
    boolean award2 = (number1 == result2) && (number2 == result1);

    boolean award3 =
        (number1 == result1)
            || (number1 == result2)
            || (number2 == result2)
            || (number2 == result1);

    // Show result
    System.out.println("Result is : " + result1 + " : " + result2);

    if (award1) {
      System.out.println("You win $10.000");
    } else if (award2) {
      System.out.println("You win $3.000");
    } else if (award3) {
      System.out.println("You win $1.000");
    } else {
      System.out.println("You are not win");
    }
  }
}
