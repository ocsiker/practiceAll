package com.introduction12.exercise;

public class GuessNumber {
  public static void main(String[] args) {
    // Generate a random number to be guessed
    int number = (int) (Math.random() * 100);
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    //
    int guessNumber = -1;
    while (guessNumber != number) {
      // Prompt the user to
      // Enter the guess number
      System.out.print("Enter your guess: ");
      guessNumber = input.nextInt();

      if (guessNumber == number) {
        System.out.println("Yes, the number is " + number);
      } else if (guessNumber > number) {
        System.out.println("No, the number is too high");
      } else {
        System.out.println("No, the number is too low");
      }
    }
    // Close the input
    input.close();

  }
}
