public class ReverseString {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to enter
    // Enter a string
    System.out.print("Enter a string: ");
    String str = input.next();
    String reversedStr = "";
    for (int i = str.length() - 1; i > -1; i--) {
      reversedStr += str.charAt(i);
    }

    System.out.println("The reversed string is: " + reversedStr);
  }
}
