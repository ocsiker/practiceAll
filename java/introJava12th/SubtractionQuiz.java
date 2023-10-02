public class SubtractionQuiz {
  public static void main(String[] args) {
    // Generate two number
    // number1 and number2
    int number1 = (int) (Math.random() * 10);
    int number2 = (int) (Math.random() * 10);

    //
    // If number1 < number2
    // swap number1 with number2
    if (number1 < number2) {
      int swap = number1;
      number1 = number2;
      number2 = swap;
    }
    //
    // Prompt the student to answer
    // What is number1 - number2 ?
    System.out.println("What is " + number1 + " - " + number2 + "?");
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    int answer = input.nextInt();

    // Check student's answer
    // display whether the answer correct.
    if (answer == (number1 - number2)) {
      System.out.println("You are correct!");
    } else {
      System.out.println("You are incorrect!");
    }
    // Close input
    input.close();
  }
}
