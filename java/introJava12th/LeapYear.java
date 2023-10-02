public class LeapYear {
  public static void main(String[] args) {
    // Create a Scanner
    //
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Enter year to check is leap year

    System.out.println("Enter a year: ");

    int year = input.nextInt();

    boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    // Display result
    System.out.println("The " + year + " is a leap year? " + isLeapYear);
  }
}
