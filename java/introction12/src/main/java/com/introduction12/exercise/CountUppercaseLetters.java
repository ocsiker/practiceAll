public class CountUppercaseLetters {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to enter
    // Enter a string
    System.out.print("Enter a string: ");
    String str = input.nextLine();

    // Count the uppercase letters
    int countUppercaseLetters = 0;
    for (int i = 0; i < str.length(); i++) {
      // Range of letter A to Z in acsii is integer value from 65 to 90
      if ((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 90) {
        countUppercaseLetters++;
      }
    }
    System.out.println("The number of uppercase letters is :" + countUppercaseLetters);
    input.close();
  }
}
