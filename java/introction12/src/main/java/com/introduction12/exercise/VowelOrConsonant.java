public class VowelOrConsonant {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter a letter:
    System.out.print("Enter a letter: ");
    char ch = input.next().toLowerCase().charAt(0);
    // check in range a to z or A to A

    if (Character.isLetter(ch)) {

      // Check ch is vowel if ch is one of a e u i o
      boolean isVowel = ch == 'a' || ch == 'e' || ch == 'u' || ch == 'i' || ch == 'o' ? true : false;
      if (isVowel) {
        System.out.println(ch + " is a vowel ");
      } else {
        System.out.println(ch + " is a consonant ");
      }
    } else {
      System.out.println(ch + " is an invalid input");
    }

    //
    // Display the result
    // Close the Scanner
    input.close();
    //
  }
}
