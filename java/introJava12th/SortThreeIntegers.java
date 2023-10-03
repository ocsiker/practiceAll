public class SortThreeIntegers {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Enter three integers to sort

    System.out.print("Enter three integers: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    int number3 = input.nextInt();

    // sort number
    // If have at least one number behind number1 is larger than number1
    // we swap them
    int temp;
    if (number1 < number2 || number1 < number3) {
      if (number1 < number2) {
        temp = number1;
        number1 = number2;
        number2 = temp;
      }
      if (number1 < number3) {
        temp = number1;
        number1 = number3;
        number3 = temp;
      }
    }

    if (number2 < number3) {

      temp = number2;
      number2 = number3;
      number3 = temp;
    }

    // Display number is descending order
    System.out.println(number1 + " " + number2 + " " + number3);
  }
}
