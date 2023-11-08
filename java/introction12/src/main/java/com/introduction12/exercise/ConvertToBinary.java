public class ConvertToBinary {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter the decimal number to convert
    System.out.print("Enter the decimal number: ");
    int number = input.nextInt();
    // String store binary number
    String binaryNumberReverse = "";
    String binaryNumber = "";
    while (number / 2 != 0) {
      binaryNumberReverse += Integer.toString(number % 2);
      number /= 2;
    }
    // add the last number
    binaryNumberReverse += Integer.toString(number);
    // Display the result
    for (int i = 0; i < binaryNumberReverse.length(); i++) {
      binaryNumber = binaryNumberReverse.charAt(i) + binaryNumber;
    }
    System.out.println("The decimal number  is equal with binary " + binaryNumber);
    // Close the input
    input.close();
  }
}
