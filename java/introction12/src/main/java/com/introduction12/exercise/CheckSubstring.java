public class CheckSubstring {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter the string s1:
    System.out.print("Enter the string s1: ");
    String s1 = input.next();
    // Enter the string s2:
    System.out.print("Enter the string s2: ");
    String s2 = input.next();
    // if s1 contains s1 => s2 is a substring of s1
    //
    // Display result
    if (s1.contains(s2)) {
      System.out.println(s2 + " is a substring  of " + s1);
    } else {

      System.out.println(s2 + " is not a substring  of " + s1);
    }

    // Close the Scanner
    input.close();
  }
}
