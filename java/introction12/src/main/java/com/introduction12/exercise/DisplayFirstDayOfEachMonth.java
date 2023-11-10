// package com.introduction12.exercise;

public class DisplayFirstDayOfEachMonth {
  public static void main(String[] args) {
    // Display the first day of each month
    // with the user to input year and the first day of the year
    // example user entered the year is 2013 and 2 for tuesday
    //
    final int THIRTY_ONE_DAYS = 31;
    final int THIRTY_DAYS = 30;
    final int TWENTY_NINE_DAYS = 29;
    final int TWENTY_EIGHT_DAYS = 28;
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter the year
    System.out.print("Enter the year: ");
    int year = input.nextInt();
    // Enter the first day of year
    int theFirstDayOfYear = input.nextInt();
    // Exit 1 when entered wrong value
    if (theFirstDayOfYear < 0 || theFirstDayOfYear > 7 || year < 0) {
      System.out.println("Please enter year > 0 or day from 1 to 7 ");
      System.exit(1);
    }
    // check is leap year
    // if leap year the february has 29 day
    // else february has 28 day
    boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    // daysOfMonth is
    // month 1 3 5 7 8 10 12 has 31 days
    // System.out.print("o");
    // the 2 4 6 9 11 has 30 days
    //
    // Algorithm is
    // the day is 1 2 3 4 5 6 7 correspondent
    // monday tuesday wednesday thursday friday saturday sunday
    // (firstDayOfYear + daysOfMonth)%7 = day --> correspondent
    int day1 = theFirstDayOfYear;
    int day2 = (day1 + THIRTY_ONE_DAYS) % 7;
    int day3 = isLeapYear ? (day2 + TWENTY_NINE_DAYS) % 7 : (day2 + TWENTY_EIGHT_DAYS) % 7;
    int day4 = (day3 + THIRTY_ONE_DAYS) % 7;
    int day5 = (day4 + THIRTY_DAYS) % 7;
    int day6 = (day5 + THIRTY_ONE_DAYS) % 7;
    int day7 = (day6 + THIRTY_DAYS) % 7;
    int day8 = (day7 + THIRTY_ONE_DAYS) % 7;
    int day9 = (day8 + THIRTY_ONE_DAYS) % 7;
    int day10 = (day9 + THIRTY_DAYS) % 7;
    int day11 = (day10 + THIRTY_ONE_DAYS) % 7;
    int day12 = (day11 + THIRTY_DAYS) % 7;
    for (int i = 1; i < 13; i++) {
      switch (i) {
        case 1:
          System.out.print("January 1, " + year + " is "); // Dispay day of each month
          switch (day1) {
            case 1:
              System.out.print("Monday\n");
              break;
            case 2:
              System.out.print("Tuesday\n");
              break;
            case 3:
              System.out.print("Wednesday\n");
              break;
            case 4:
              System.out.print("Thursday\n");
              break;
            case 5:
              System.out.print("Friday\n");
              break;
            case 6:
              System.out.print("Saturday\n");
              break;
            case 0:
              System.out.print("Sunday\n");
              break;
            default:
              break;
          }
          break;
        case 2:
          System.out.print("February 1, " + year + " is "); // Dispay day of each month
          switch (day2) {
            case 1:
              System.out.print("Monday\n");
              break;
            case 2:
              System.out.print("Tuesday\n");
              break;
            case 3:
              System.out.print("Wednesday\n");
              break;
            case 4:
              System.out.print("Thursday\n");
              break;
            case 5:
              System.out.print("Friday\n");
              break;
            case 6:
              System.out.print("Saturday\n");
              break;
            case 0:
              System.out.print("Sunday\n");
              break;
            default:
              break;
          }
          break;
        case 3:
          System.out.print("March 1, " + year + " is "); // Dispay day of each month
          switch (day3) {
            case 1:
              System.out.print("Monday\n");
              break;
            case 2:
              System.out.print("Tuesday\n");
              break;
            case 3:
              System.out.print("Wednesday\n");
              break;
            case 4:
              System.out.print("Thursday\n");
              break;
            case 5:
              System.out.print("Friday\n");
              break;
            case 6:
              System.out.print("Saturday\n");
              break;
            case 0:
              System.out.print("Sunday\n");
              break;
            default:
              break;
          }
          break;
        case 4:
          System.out.print("April 1, " + year + " is "); // Dispay day of each month
          switch (day4) {
            case 1:
              System.out.print("Monday\n");
              break;
            case 2:
              System.out.print("Tuesday\n");
              break;
            case 3:
              System.out.print("Wednesday\n");
              break;
            case 4:
              System.out.print("Thursday\n");
              break;
            case 5:
              System.out.print("Friday\n");
              break;
            case 6:
              System.out.print("Saturday\n");
              break;
            case 0:
              System.out.print("Sunday\n");
              break;
            default:
              break;
          }
          break;
        case 5:
          System.out.print("May 1, " + year + " is "); // Dispay day of each month
          switch (day5) {
            case 1:
              System.out.print("Monday\n");
              break;
            case 2:
              System.out.print("Tuesday\n");
              break;
            case 3:
              System.out.print("Wednesday\n");
              break;
            case 4:
              System.out.print("Thursday\n");
              break;
            case 5:
              System.out.print("Friday\n");
              break;
            case 6:
              System.out.print("Saturday\n");
              break;
            case 0:
              System.out.print("Sunday\n");
              break;
            default:
              break;
          }
          break;
        case 6:
          System.out.print("June 1, " + year + " is "); // Dispay day of each month
          switch (day6) {
            case 1:
              System.out.print("Monday\n");
              break;
            case 2:
              System.out.print("Tuesday\n");
              break;
            case 3:
              System.out.print("Wednesday\n");
              break;
            case 4:
              System.out.print("Thursday\n");
              break;
            case 5:
              System.out.print("Friday\n");
              break;
            case 6:
              System.out.print("Saturday\n");
              break;
            case 0:
              System.out.print("Sunday\n");
              break;
            default:
              break;
          }
          break;
        case 7:
          System.out.print("July 1, " + year + " is "); // Dispay day of each month
          switch (day7) {
            case 1:
              System.out.print("Monday\n");
              break;
            case 2:
              System.out.print("Tuesday\n");
              break;
            case 3:
              System.out.print("Wednesday\n");
              break;
            case 4:
              System.out.print("Thursday\n");
              break;
            case 5:
              System.out.print("Friday\n");
              break;
            case 6:
              System.out.print("Saturday\n");
              break;
            case 0:
              System.out.print("Sunday\n");
              break;
            default:
              break;
          }
          break;
        case 8:
          System.out.print("August 1, " + year + " is "); // Dispay day of each month
          switch (day8) {
            case 1:
              System.out.print("Monday\n");
              break;
            case 2:
              System.out.print("Tuesday\n");
              break;
            case 3:
              System.out.print("Wednesday\n");
              break;
            case 4:
              System.out.print("Thursday\n");
              break;
            case 5:
              System.out.print("Friday\n");
              break;
            case 6:
              System.out.print("Saturday\n");
              break;
            case 0:
              System.out.print("Sunday\n");
              break;
            default:
              break;
          }
          break;
        case 9:
          System.out.print("September 1, " + year + " is "); // Dispay day of each month
          switch (day9) {
            case 1:
              System.out.print("Monday\n");
              break;
            case 2:
              System.out.print("Tuesday\n");
              break;
            case 3:
              System.out.print("Wednesday\n");
              break;
            case 4:
              System.out.print("Thursday\n");
              break;
            case 5:
              System.out.print("Friday\n");
              break;
            case 6:
              System.out.print("Saturday\n");
              break;
            case 0:
              System.out.print("Sunday\n");
              break;
            default:
              break;
          }
          break;
        case 10:
          System.out.print("October 1, " + year + " is "); // Dispay day of each month
          switch (day10) {
            case 1:
              System.out.print("Monday\n");
              break;
            case 2:
              System.out.print("Tuesday\n");
              break;
            case 3:
              System.out.print("Wednesday\n");
              break;
            case 4:
              System.out.print("Thursday\n");
              break;
            case 5:
              System.out.print("Friday\n");
              break;
            case 6:
              System.out.print("Saturday\n");
              break;
            case 0:
              System.out.print("Sunday\n");
              break;
            default:
              break;
          }
          break;
        case 11:
          System.out.print("November 1, " + year + " is "); // Dispay day of each month
          switch (day11) {
            case 1:
              System.out.print("Monday\n");
              break;
            case 2:
              System.out.print("Tuesday\n");
              break;
            case 3:
              System.out.print("Wednesday\n");
              break;
            case 4:
              System.out.print("Thursday\n");
              break;
            case 5:
              System.out.print("Friday\n");
              break;
            case 6:
              System.out.print("Saturday\n");
              break;
            case 0:
              System.out.print("Sunday\n");
              break;
            default:
              break;
          }
          break;
        case 12:
          System.out.print("December 1, " + year + " is "); // Dispay day of each month
          switch (day12) {
            case 1:
              System.out.print("Monday\n");
              break;
            case 2:
              System.out.print("Tuesday\n");
              break;
            case 3:
              System.out.print("Wednesday\n");
              break;
            case 4:
              System.out.print("Thursday\n");
              break;
            case 5:
              System.out.print("Friday\n");
              break;
            case 6:
              System.out.print("Saturday\n");
              break;
            case 0:
              System.out.print("Sunday\n");
              break;
            default:
              break;
          }
          break;
        default:
          break;
      }
    }
  }
}
