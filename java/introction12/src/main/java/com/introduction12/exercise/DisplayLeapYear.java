public class DisplayLeapYear {
  public static void main(String[] args) {
    // Display leap year from 101 to 2100

    int numberOfLeapYears = 0;
    System.out.print("The leap year from 101 to 2100 is: ");
    for (int i = 101; i < 2101; i++) {
      boolean isLeapYear = (i % 4 == 0 && i % 100 != 0) || (i % 400 == 0);
      // 10 elements per line
      if (isLeapYear) {
        // increase when have a leap year
        numberOfLeapYears++;
        if (numberOfLeapYears % 10 == 0) {
          // if enough 10 elements on a line break new line
          System.out.println(i + " ");
        } else {
          // less then 10 elements on a line print element
          System.out.print(i + " ");
        }

      }
    }

    // the number of leap years in this period
    System.out.println("\nThe number of leap years is: " + numberOfLeapYears);
  }
}
