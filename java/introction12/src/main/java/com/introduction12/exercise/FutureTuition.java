// package com.introduction12.exercise;

public class FutureTuition {
  public static void main(String[] args) {
    /*
     * futureTuition ==2*tuition;
     * futureTuition = tuition
     * year = 0
     * while(futureTuition - 2*tuition > math.pow(10,-6))
     * {
     * futureTuition += futureTuition * 1.07;
     * year ++ ;
     * 
     * }
     */
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter the tuition
    System.out.print("Enter the tuition: ");
    double tuition = input.nextDouble();
    // year initial
    int year = 0;
    double futureTuition = tuition;

    while (2 * tuition - futureTuition > Math.pow(10, -6)) {
      futureTuition *= 1.07;
      year++;
    }
    // Display the year have the doubled tuition

    System.out.println("It's " + year + " years to doubled tuition");
    System.out.println("The future tuition is: " + futureTuition);

    // Close the input
    input.close();

  }
}
