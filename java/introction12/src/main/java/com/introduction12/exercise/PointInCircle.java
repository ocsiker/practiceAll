// package com.introduction12.exercise;

public class PointInCircle {
  public static void main(String[] args) {
    // Create a Scanner
    //
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter the point to check
    System.out
        .print("Enter the point X(x,y) to check point in or outside circle\\n has centered at (0.0) and radius 10");
    double pxA = input.nextDouble();
    double pyA = input.nextDouble();

    //
    // Compute distance from point O(0,0) to point by formula
    // sqrt((x2-x1)^2 + (y2-y1)^2)
    double distance = Math.pow(Math.pow(pxA - 0, 0.5) + Math.pow(pyA - 0, 0.5), 0.5);

    //
    // check if distance less than or equal is 5 -> in circle
    // else out of circle
    if (distance < 5.0) {
      System.out.println("Point in or on circle!");
    } else {

      System.out.println("Point out of circle!");
    }

    input.close();
  }
}
