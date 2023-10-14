// package com.introduction12.exercise;

public class TwoRectangles {
  public static void main(String[] args) {
    // Create a Scanner
    //
    final double EPSION = Math.pow(10, -6);
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter r1's center x-, y- coordinates, width (w1) and height (h1):
    // Enter r1's center x-, y- coordinates, width (w2) and height (h2):
    System.out.print("Enter r1's center x-, y- coordinates, width, height: ");
    double cR1x = input.nextDouble();
    double cR1y = input.nextDouble();
    double wR1 = input.nextDouble();
    double hR1 = input.nextDouble();
    System.out.print("Enter r2's center x-, y- coordinates, width, height: ");
    double cR2x = input.nextDouble();
    double cR2y = input.nextDouble();
    double wR2 = input.nextDouble();
    double hR2 = input.nextDouble();
    // Check rectangle is inside or overlap or not overlap
    // distanceCoordinateX = Math.asb (x2 - x1)
    // distanceCoordinateY = Math.asb (y2 - y1)
    double distanceCoordinateX = cR2x >= cR1x ? cR2x - cR1x : cR1x - cR2x;
    double distanceCoordinateY = cR2y >= cR1y ? cR2y - cR1y : cR1y - cR2y;

    // if r2IsInsider1 = distanceCoordinateX + w2/2 < w1/2
    // && distanceCoordinateY + h2/2 < h1/2
    // elseif r2IsOverlapr1 = distanceCoordinateX < w1/2 + w2/2
    // || distanceCoordinateY < h1/2 + h2/2
    // else notOverlap
    //
    boolean r2IsInsider1 = ((distanceCoordinateX + wR2 / 2) - wR1 / 2 < EPSION)
        && ((distanceCoordinateY + hR2 / 2) - hR1 / 2 < EPSION);
    boolean r2IsOverlapr1 = (distanceCoordinateX - (wR1 / 2 + wR2 / 2) < EPSION)
        || (distanceCoordinateY - (hR1 / 2 + hR2 / 2) < EPSION);

    if (r2IsInsider1) {
      System.out.println("r2 inside r1");
    } else if (r2IsOverlapr1) {
      System.out.println("r2 overlap r1");
    } else {
      System.out.println("r2 not overlap r1");
    }
    // Close the Scanner
    input.close();
  }
}
