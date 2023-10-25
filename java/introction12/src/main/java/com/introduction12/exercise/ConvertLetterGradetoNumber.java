public class ConvertLetterGradetoNumber {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    //
    // Prompt the user to
    // Enter a letter grade:
    System.out.print("Enter a letter grade: ");
    char letter = input.next().charAt(0);
    // if letter A --> grade 4
    // if letter B --> grade 3
    // if letter C --> grade 2
    // if letter D --> grade 1
    //
    // Display output
    if (letter >= 'A' && letter <= 'F') {
      switch (letter) {
        case 'A':
          System.out.println("The numeric value for grade " + letter + " is " + 4);
          break;
        case 'B':
          System.out.println("The numeric value for grade " + letter + " is " + 3);
          break;
        case 'C':
          System.out.println("The numeric value for grade " + letter + " is " + 2);
          break;
        case 'D':
          System.out.println("The numeric value for grade " + letter + " is " + 1);
          break;

        default:
          break;
      }
    } else {
      System.out.println(letter + " is invalid grade");
    }
    // Close the Scanner
    input.close();
  }
}
