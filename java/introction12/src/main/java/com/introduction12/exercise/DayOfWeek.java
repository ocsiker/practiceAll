package com.introduction12.exercise;

public class DayOfWeek {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    //
    // Description
    // h is the day of the week
    // (0: Saturday, 1: Sunday, 2: Monday, 3:Tuesday, 4:Wednesday, 5:Thursday, and
    // 6: Friday)
    // q: is the day of month
    // m is the month
    // (3: March, 4:April, ..., 12:December) January and February are counted as
    // months 13 and 14
    // of the previous year
    // j: year/100
    // k: is the year of the century( i.e. year % 100)
    // all division is enteger division
    //
    //
    // Prompt the user to
    // Enter year (e.g. 2012)
    // int h, q, m, j, k;
    // m = -1;
    // q = -1;
    // j = 2020;
    System.out.print("Enter year (e.g. 2012)");
    int year = input.nextInt();
    int j = year / 100;
    int k = year % 100;
    // Enter month (1-12)
    System.out.print("Enter month (1-12)");
    int m = input.nextInt();
    // Enter the day of the month (1-31):
    System.out.print("Enter the day of the month (1-31):");
    int q = input.nextInt();
    // Day of the week is:
    //
    // Compute to detemine the day of the week
    // h = (q + 26*(m+1)/10 + k + k/4 + j/4 + 5*j) % 7
    // check input in range of requirements
    boolean valid = (m > 0 && m < 13) && (q > 0 && q < 32);
    if (valid) {
      if (m < 3) {
        m += 12;
        // compute j k when m < 3 beacause year to be counted the previous year
        j = (year - 1) / 100;
        k = (year - 1) % 100;
      }
      int h = (q + (26 * (m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

      System.out.print("Day of the week is: ");
      switch (h) {
        case 0:
          System.out.println(" Saturday");
          break;

        case 1:
          System.out.println(" Sunday");
          break;

        case 2:
          System.out.println(" Monday");
          break;

        case 3:
          System.out.println(" Tuesday");
          break;

        case 4:
          System.out.println(" Wednesday");
          break;

        case 5:
          System.out.println(" Thursday");
          break;

        case 6:
          System.out.println(" Friday");
          break;
        default:
          break;
      }

    } else {
      System.out.println("Values input out of ranges");
    }
    //
    // Convert if the month input < 3 to 13 or 14 of previous year
    // if m < 3
    // m = m + 12 && j -=1; (1 -> 13 = 12 + 1 && j = j-1 ;)
    input.close();

  }
}
