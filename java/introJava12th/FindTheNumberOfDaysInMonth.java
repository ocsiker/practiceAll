public class FindTheNumberOfDaysInMonth {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Enter month and year
    System.out.print("Enter month and year (1 January 2 February ...): ");
    int month = input.nextInt();
    int year = input.nextInt();

    switch (month) {
      case 1:
        System.out.print("January " + year);
        break;
      case 2:
        System.out.print("February " + year);
        break;
      case 3:
        System.out.print("March " + year);
        break;
      case 4:
        System.out.print("April " + year);
        break;
      case 5:
        System.out.print("May " + year);
        break;
      case 6:
        System.out.print("June" + year);
        break;
      case 7:
        System.out.print("July " + year);
        break;
      case 8:
        System.out.print("August" + year);
        break;
      case 9:
        System.out.print("September " + year);
        break;
      case 10:
        System.out.print("October" + year);
        break;
      case 11:
        System.out.print("Novembrer" + year);
        break;
      case 12:
        System.out.print("December" + year);
        break;
    }

    switch (month) {
      case 1, 3, 5, 7, 8, 10, 12:
        System.out.println(" has 31 days");
        break;
      case 4, 6, 9, 11:
        System.out.println(" has 30 days");
        break;
      case 2:
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
          System.out.println(" has 29 days");
        } else {
          System.out.println(" has 28 days");
        }
        break;
    }

    input.close();
  }
}
