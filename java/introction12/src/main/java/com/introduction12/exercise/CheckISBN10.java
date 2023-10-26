// package com.introduction12.exercise;

public class CheckISBN10 {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter the first 9 digits of an ISBN as string
    System.out.print("Enter the first 9 digits of an ISBN as string: ");
    String isbn9digits = input.next();
    // Formular generate d10 in ISBN-10 (d1d2d3d4d5d6d7d8d9d10)

    // d10 = (d1* 1 + d2* 2 + d3* 3 + d4* 4 + d5* 5 + d6* 6 + d7* 7 +
    // d8* 8 + d9* 9 ) %11
    int sum = 0;
    if (isbn9digits.length() != 9) {
      System.out.println(isbn9digits + " is not 9 digits");
      System.exit(1);
    }

    for (int i = 0; i < 9; i++) {
      if (Character.isDigit(isbn9digits.charAt(i)))
        sum += (isbn9digits.charAt(i) - '0') * (i + 1);
    }
    sum %= 11;
    if (sum == 10) {
      System.out.println("ISBN-10 is " + isbn9digits + 'X');
    } else {
      System.out.println("ISBN-10 is " + isbn9digits + sum);
    }
    // Close the Scanner
    input.close();
  }
}
