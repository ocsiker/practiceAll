public class FindTheFactorOfInteger {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter integer number
    System.out.print("Enter integer number: ");
    int number = input.nextInt();
    //
    // Finding the smallest factors in an increasing order
    for (int i = 2; i < number + 1; i++) {
      if (number % i == 0) {
        System.out.print(i + " ");
        number = number / i;
        i--; // forceback to later in i++ to guarantee not increase
      }

    }
    //
    // Close a input
    input.close();
  }
}
