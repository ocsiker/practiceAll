public class DaysOfMonth {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter a year:
    // Enter a month:
    System.out.print("Enter a year: ");
    int year = input.nextInt();
    System.out.print("Enter a month: ");
    String month = input.next();
    // Months have 31 days is 1 3 5 7 8 10 12
    // Months have 30 days is 4 6 9 11
    // Month has 28 or 29 is 2
    switch (month) {
      case "Jan":
      case "May":
      case "Jul":
      case "Aug":
      case "Oct":
      case "Dec":
        System.out.println(month + " " + year + " has 31 days");
        break;
      case "Mar":
      case "Apr":
      case "Jun":
      case "Sep":
      case "Nov":
        System.out.println(month + " " + year + " has 30 days");
        break;
      case "Feb":
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
          System.out.println(month + " " + year + " has 29 days");
        } else {
          System.out.println(month + " " + year + " has 28 days");
        }

      default:
        System.out.println(month + " is invalid input");
        break;
    }
    //
    //
    //
    //
  }
}
