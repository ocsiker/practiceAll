import javax.print.attribute.standard.PrinterInfo;

public class DisplayCanlendars {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    //
    // Prompt the user to
    // Enter the year
    System.out.print("Enter the year: ");
    int year = input.nextInt();
    // Enter the first day of the year
    System.out.print("Enter the first day of the year: ");
    int theFirstDay = input.nextInt();

    // Guarantee the user input right
    boolean isInputTrue = year > 0 && (theFirstDay > -1 && theFirstDay < 7);

    // Programme will exit with status 1 if user input wrong
    if (!isInputTrue) {
      System.out.println("You're input invalid: year > 0 and the first day 0-6 0-Sunday 6- Saturday");

      System.exit(1);
    }
    // the first day of month
    // check yaer is leap year
    boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    // System.out.println("the year : " + year + " the first day: " + theFirstDay);
    int numberOfDaysInMonth = 0;
    for (int month = 1; month <= 12; month++) {
      switch (month) {
        case 1:
          System.out.printf("%23s %4d\n", "January", year);
          // System.out.print("January" + " 1 ");
          numberOfDaysInMonth = 31;
          break;
        case 2:
          System.out.printf("%23s %4d\n", "Febuary", year);
          // System.out.print("Febuary" + " 1 ");
          numberOfDaysInMonth = isLeapYear ? 29 : 28;
          break;
        case 3:
          System.out.printf("%23s %4d\n", "March", year);
          // System.out.print("March" + " 1 ");
          numberOfDaysInMonth = 31;
          break;
        case 4:
          System.out.printf("%23s %4d\n", "April", year);
          // System.out.print("April" + " 1 ");
          numberOfDaysInMonth = 30;
          break;
        case 5:
          System.out.printf("%23s %4d\n", "May", year);
          // System.out.print("May" + " 1 ");
          numberOfDaysInMonth = 31;
          break;
        case 6:
          System.out.printf("%23s %4d\n", "June", year);
          // System.out.print("June" + " 1 ");
          numberOfDaysInMonth = 30;
          break;
        case 7:
          System.out.printf("%23s %4d\n", "July", year);
          // System.out.print("July" + " 1 ");
          numberOfDaysInMonth = 31;
          break;
        case 8:
          System.out.printf("%23s %4d\n", "August", year);
          // System.out.print("August" + " 1 ");
          numberOfDaysInMonth = 31;
          break;
        case 9:
          System.out.printf("%23s %4d\n", "Septempber", year);
          // System.out.print("Septempber" + " 1 ");
          numberOfDaysInMonth = 30;
          break;
        case 10:
          System.out.printf("%23s %4d\n", "October", year);
          // System.out.print("October" + " 1 ");
          numberOfDaysInMonth = 31;
          break;
        case 11:
          System.out.printf("%23s %4d\n", "November", year);
          // System.out.print("November" + " 1 ");
          numberOfDaysInMonth = 30;
          break;
        case 12:
          System.out.printf("%23s %4d\n", "December", year);
          numberOfDaysInMonth = 31;
          // System.out.print("December" + " 1 ");
          break;

        default:
          break;

      }

      // Display dash line
      for (int i = 0; i < 38; i++) {
        System.out.printf("%s", "-");
      }
      // Break line
      System.out.println();
      System.out.printf("%5s%5s%5s%5s%5s%5s%5s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");

      // Display the date in
      for (int i = 0; i < theFirstDay; i++) {
        System.out.printf("%5s", " ");
      }

      for (int i = 0; i < numberOfDaysInMonth; i++) {
        System.out.printf("%5d", i + 1);

        if ((i + 1 + theFirstDay) % 7 == 0) {
          System.out.println();
        }
      }
      // the first day for next month
      theFirstDay = (theFirstDay + numberOfDaysInMonth) % 7;

      System.out.println();
    }

  }
} //
