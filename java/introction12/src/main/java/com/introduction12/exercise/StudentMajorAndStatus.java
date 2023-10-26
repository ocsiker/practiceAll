public class StudentMajorAndStatus {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    //
    // Prompt the user to
    // Enter two characters
    System.out.print("Enter  two characters: ");
    String twoCharacters = input.next();
    //
    // Check the first character is M C I (Mathematics, Computer Science,
    // Information Technology)
    // The second character is 1 2 3 4 (freshman, sophomore, junior and senior)
    switch (twoCharacters.charAt(0)) {

      case 'M':
        System.out.print("Mathematics ");
        switch (twoCharacters.charAt(1)) {
          case '1':
            System.out.print("Freshman");
            break;
          case '2':
            System.out.print("Sophomore");
            break;
          case '3':
            System.out.print("Junior");
            break;
          case '4':
            System.out.print("Senior");
            break;

          default:
            System.out.println(twoCharacters.charAt(1) + " is invalid status");
            break;
        }
        break;
      case 'C':
        System.out.print("Computer Science ");
        switch (twoCharacters.charAt(1)) {
          case '1':
            System.out.print("Freshman");
            break;
          case '2':
            System.out.print("Sophomore");
            break;
          case '3':
            System.out.print("Junior");
            break;
          case '4':
            System.out.print("Senior");
            break;

          default:
            System.out.println(twoCharacters.charAt(1) + " is invalid status");
            break;
        }
        break;
      case 'I':
        System.out.print("Information Technology ");
        switch (twoCharacters.charAt(1)) {
          case '1':
            System.out.print("Freshman");
            break;
          case '2':
            System.out.print("Sophomore");
            break;
          case '3':
            System.out.print("Junior");
            break;
          case '4':
            System.out.print("Senior");
            break;
          default:
            System.out.println(twoCharacters.charAt(1) + " is invalid status");
            break;
        }
        break;
      default:
        System.out.println(twoCharacters.charAt(0) + " is invalid major");
        break;
    }
    System.out.println("\n");

    // Close the Scanner
    input.close();
  }
}
