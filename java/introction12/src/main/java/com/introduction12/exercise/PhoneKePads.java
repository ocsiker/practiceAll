public class PhoneKePads {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    //
    // Prompt the user to
    // Enter a letter
    System.out.print("Enter a letter: ");
    char letter = input.next().toLowerCase().charAt(0);

    //
    // if a b c -- > 2
    // if d e f -- > 3
    // if g h i -- > 4
    // if j k l -- > 5
    // if m n o -- > 6
    // if p q r s -- > 7
    // if t u v -- > 8
    // if w x y z-- > 9
    //
    if (Character.isLetter(letter)) {
      switch (letter) {
        case 'a':
        case 'b':
        case 'c':
          System.out.println("The corresponding number is : " + 2);
          break;
        case 'd':
        case 'e':
        case 'f':
          System.out.println("The corresponding number is : " + 3);
          break;
        case 'g':
        case 'h':
        case 'i':
          System.out.println("The corresponding number is : " + 4);
          break;
        case 'j':
        case 'k':
        case 'l':
          System.out.println("The corresponding number is : " + 5);
          break;
        case 'm':
        case 'n':
        case 'o':
          System.out.println("The corresponding number is : " + 6);
          break;
        case 'p':
        case 'q':
        case 'r':
        case 's':
          System.out.println("The corresponding number is : " + 7);
          break;
        case 't':
        case 'u':
        case 'v':
          System.out.println("The corresponding number is : " + 8);
          break;
        case 'w':
        case 'x':
        case 'y':
        case 'z':
          System.out.println("The corresponding number is : " + 9);
          break;

        default:
          break;
      }
    } else {
      System.out.println(letter + " is invalid input");
    }

    // Close the Scanner
    input.close();

  }
}
