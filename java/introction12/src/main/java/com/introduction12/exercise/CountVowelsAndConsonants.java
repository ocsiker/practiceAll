public class CountVowelsAndConsonants {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to enter
    // Enter a string
    System.out.print("Enter a string: ");
    String str = input.nextLine();
    // Count the vowels
    int numberLetterVowels = 0;
    int numberLetterConsonants = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != ' ') {
        switch (str.charAt(i)) {
          case 'A':
          case 'a':
          case 'E':
          case 'e':
          case 'I':
          case 'i':
          case 'O':
          case 'o':
          case 'U':
          case 'u':
            numberLetterVowels++;
            break;

          default:
            numberLetterConsonants++;
            break;
        }
      }
    }
    //
    System.out.println("The number of vowels is: " + numberLetterVowels);
    System.out.println("The number of consonants is: " + numberLetterConsonants);
    //
    input.close();
  }
}
