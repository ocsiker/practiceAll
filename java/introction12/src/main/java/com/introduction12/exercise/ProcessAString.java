public class ProcessAString {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter a string
    System.out.print("Enter a string: ");
    String str = input.next();
    System.out.println("The length of string is " + str.length() + " and the first chacracter is " + str.charAt(0));
    //
    // Display string's length and its first chacracter
    input.close();
  }
}
