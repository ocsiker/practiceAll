public class CheckSSN {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter a SSN:
    System.out.print("Enter a SSN: ");
    String ssn = input.next();
    // if SSN type DDD-DD-DDDD where D is digit
    if (ssn.length() != 11) {
      System.out.println("Enter a SSN follow format DDD-DD-DDDD");
      System.exit(1);
    }
    // Flag for input true
    boolean flag = true;
    // Find position of the first dash
    int posFirstDash = ssn.indexOf('-');
    // Find position of the second dash
    int posSecondDash = ssn.lastIndexOf('-');
    //
    if (posFirstDash == 3 && posSecondDash == 6) {
      // Check the 3 letters are digits
      for (int i = 0; i < posFirstDash; i++) {
        flag = Character.isDigit(ssn.charAt(i));
        if (!flag) {
          System.out.println(ssn + " is invalid input");
          System.exit(1);
        }
      }
      // Check two digits in middle
      for (int i = posFirstDash + 1; i < posSecondDash; i++) {
        flag = Character.isDigit(ssn.charAt(i));
        if (!flag) {
          System.out.println(ssn + " is invalid input");
          System.exit(1);
        }
      }
      // Check the last 4 letters are digits
      for (int i = posSecondDash + 1; i < ssn.length(); i++) {
        flag = Character.isDigit(ssn.charAt(i));
        if (!flag) {
          System.out.println(ssn + " is invalid input");
          System.exit(1);
        }
      }
      // ssn is valid
      System.out.println(ssn + " is a valid social security number");
    } else {
      System.out.println(ssn + " is an invalid social security number");
      System.exit(1);
    }

    // Close the Scanner
    input.close();
  }
}
