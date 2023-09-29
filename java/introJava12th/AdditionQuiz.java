public class AdditionQuiz {
  public static void main(String[] args) {
    // Generate number1 (is lasted number) number2 (the second number from the
    // last) from current time milli
    int number1 = (int) (System.currentTimeMillis() % 10);
    int number2 = (int) (System.currentTimeMillis() / 10 % 10);
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Show question
    System.out.println("what is " + number1 + " + " + number2 + " ?");
    // Prompt the user to
    // Create answer
    int answer = input.nextInt();
    // Display result
    System.out.println(
        number1 + " + " + number2 + " = " + answer + " is " + (answer == number1 + number2));
    // Close input
    input.close();
  }
}
