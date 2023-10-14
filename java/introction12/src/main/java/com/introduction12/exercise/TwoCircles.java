// package com.introduction12.exercise;

public class TwoCircles {
  public static void main(String[] args) {
    // Create a Scanner
    final double EPSILON = Math.pow(10, -6);
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user
    // Enter Circle1's Center x-, y- coordinates, and radius
    // Enter Circle2's Center x-, y- coordinates, and radius
    System.out.print("Enter Circle1's center x-, y- coordinates, and radius: ");
    double centerCircle1x = input.nextDouble();
    double centerCircle1y = input.nextDouble();
    double radiusCircle1 = input.nextDouble();
    System.out.print("Enter Circle2's center x-, y- coordinates, and radius: ");
    double centerCircle2x = input.nextDouble();
    double centerCircle2y = input.nextDouble();
    double radiusCircle2 = input.nextDouble();
    // distanceBetweenCenter1And2 =sqrt( (centerCircle1x -centerCircle2x)^2 +
    // (centerCircle1y - centerCircle2y))
    double distanceBetweenCenter1And2 = Math
        .pow(Math.pow(centerCircle1x - centerCircle2x, 2) + Math.pow(centerCircle1y - centerCircle2y, 2), 0.5);
    boolean r2IsInsider1 = (distanceBetweenCenter1And2 + radiusCircle2 / 2 - radiusCircle1 / 2) < EPSILON;
    boolean r2IsOverlapr1 = (distanceBetweenCenter1And2 - radiusCircle2 / 2 - radiusCircle1 / 2) < EPSILON;
    //
    // r2 is inside r1
    // r2IsInsider1 = (distanceBetweenCenter1And2 + r2/2 )< r1/2
    // r2IsOverlapr1 = (distanceetweenCenter1And2 )< r1/2 + r2/2
    // r2 not overlap r1
    if (r2IsInsider1) {
      System.out.println("circle2 is inside circle1");
    } else if (r2IsOverlapr1) {
      System.out.println("circle2 is overlap circle1");
    } else {
      System.out.println("circle2 is not overlap circle1");
    }
    // Close the Scanner
    input.close();
  }
}
