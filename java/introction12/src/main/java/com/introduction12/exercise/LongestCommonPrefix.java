public class LongestCommonPrefix {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to enter
    // Enter the first string
    System.out.print("Enter the first string: ");
    String firstString = input.nextLine();
    // Enter the second string
    System.out.print("Enter the secon string: ");
    String secondString = input.nextLine();

    // Find the longest common prefix
    int pos = 0;
    while (firstString.charAt(pos) == secondString.charAt(pos)) {
      pos++;
    }
    if (pos != 0) {
      System.out.println("The common prefex is: " + firstString.substring(0, pos - 1));
    } else {
      System.out.println(firstString + " and " + secondString + " have no common prefix");
    }

    // close the Scanner
    input.close();
  }
}
