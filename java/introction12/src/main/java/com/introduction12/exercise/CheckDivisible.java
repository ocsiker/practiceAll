public class CheckDivisible {
  public static void main(String[] args) {
    // Create a Scanner
    //
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter an integer number to check
    System.out.print("Enter an integer to check: ");
    int number = input.nextInt();
    // Is divisible by 5 and 6
    // isDivisble5a6 = ! (number % 5 && number % 6 );
    boolean isDivisble5a6 = (number % 30 == 0);
    // isDivisble5o6 = ! (number % 5 || number % 6 );
    boolean isDivisble5o6 = (number % 5 == 0 ^ number % 6 == 0);
    // isNotDivisble5a6 = (number % 5 && number % 6 );
    boolean isNotDivisble5a6 = (number % 5 != 0 && number % 6 != 0);
    //
    if (isDivisble5a6) {
      System.out.println("Is " + number + " divisible by 5 and  6? " + isDivisble5a6);
      System.out.println("Is " + number + " divisible by 5 or  6? " + isDivisble5o6);
      System.out.println("Is " + number + " divisible by 5 or  6?, but not both ?" + !isDivisble5a6);
    } else if (isDivisble5o6) {
      System.out.println("Is " + number + " divisible by 5 and  6? " + isDivisble5a6);
      System.out.println("Is " + number + " divisible by 5 or  6? " + isDivisble5o6);
      System.out.println("Is " + number + " divisible by 5 or  6?, but not both ?" + !isDivisble5a6);
    } else {
      System.out.println("Is " + number + " divisible by 5 and  6? " + isDivisble5a6);
      System.out.println("Is " + number + " divisible by 5 or  6? " + isDivisble5o6);
      System.out.println("Is " + number + " divisible by 5 or  6?, but not both ?" + !isDivisble5a6);
    }

    // Close Scanner
    input.close();
  }
}
