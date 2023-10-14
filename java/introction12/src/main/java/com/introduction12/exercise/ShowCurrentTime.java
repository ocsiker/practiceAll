// package com.introduction12.exercise;

public class ShowCurrentTime {
  public static void main(String[] args) {

    // Create scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to input time zone offset to GMT:
    // Enter time zone
    System.out.println("Enter time zone offset to GMT: ");
    int timeZone = input.nextInt();

    // get millis time from UNIX epoch
    long totalMilliSeconds = System.currentTimeMillis();

    // Get totalSeconds by currentTimeMillis divide 1000
    long totalSeconds = totalMilliSeconds / 1000;

    // seconds current by totalSeconds % 60
    int seconds = (int) totalSeconds % 60;

    // totalMinutes current by totalSeconds / 60
    long totalMinutes = totalSeconds / 60;

    // seconds current by totalSeconds % 60
    int minutes = (int) totalMinutes % 60;

    // hours current by totalMinutes / 60
    long hours = totalMinutes / 60;
    int nowHours = (int) (hours % 24);
    if (nowHours + timeZone > 24) {
      nowHours = nowHours + timeZone - 24;
    } else {
      nowHours += timeZone;
    }
    System.out.println(
        totalMilliSeconds
            + " currentTimeMillis "
            + hours
            + " hours "
            + minutes
            + " minutes "
            + seconds
            + " seconds ");
    // the hour using a 12-hour clock
    if (nowHours + timeZone > 12) {
      System.out.println(
          "The current time is: " + (nowHours - 12) + " : " + minutes + " : " + seconds + " PM");
    } else {
      System.out.println(
          "The current time is: " + (nowHours) + " : " + minutes + " : " + seconds + " AM");

    }

    input.close();
  }
}
