// package com.introduction12.exercise;

public class ProcessString {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to Enter
    // Enter a string
    System.out.print("Enter a string: ");
    String str = input.nextLine();

    // System.out.println(str.substring(str.indexOf(" ") + 1));
    // position of the first and the second space in line
    int isOdd = 1;
    while (str.contains(" ")) {
      if (isOdd % 2 == 1) {
        System.out.printf("%s ", str.substring(0, str.indexOf(" ")));
      }

      str = str.substring(str.indexOf(" ") + 1);
      // increase the position of string
      isOdd++;
    }
    // remain string is odd string
    if (isOdd % 2 != 0) {
      System.out.printf("%s", str);
    }
    input.close();
  }
}
