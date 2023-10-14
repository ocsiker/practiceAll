// package com.introduction12.exercise;

public class IntersectingPoint {
  public static void main(String[] args) {
    final double EPSILON = Math.pow(10, -9);
    //
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    //
    // Prompt the user to
    //
    // Enter value of two points of line 1 (x1, y1), (x2, y2)
    System.out.print("Enter two points of line one x1 y1 x2 y2 ");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    System.out.print("Enter two poDoubles of line one x3 y3 x4 y4 ");
    double x3 = input.nextDouble();
    double y3 = input.nextDouble();
    double x4 = input.nextDouble();
    double y4 = input.nextDouble();
    // Enter value of two points of line 2 (x3, y3), (x4, y4)
    // Enter value of two points of line 2 (x3, y3), (x4, y4)
    // Compute coefficient of two lines
    //
    // Determine line 1 and 2 via formula
    // (y1-y2)x - (x1-x2)y = (y1-y2)x1 - (x1-x2)y1
    // (y3-y4)x - (x3-x4)y = (y3-y4)x3 - (x3-x4)y3
    // Cramer's rule
    // assign a1 = y1-y2 b1 = -(x1-x2) c1 = (y1-y2)x1 - (x1-x2)y1

    double a1 = y1 - y2;
    double b1 = -(x1 - x2);
    double c1 = (y1 - y2) * x1 - (x1 - x2) * y1;
    // assign a2 = y3-y4 b2 = -(x3-x4) c2 = (y3-y4)x3 - (x3-x4)y3
    double a2 = y3 - y4;
    double b2 = -(x3 - x4);
    double c2 = (y3 - y4) * x3 - (x3 - x4) * y3;
    // Compute D = | a1 b1| = a1*b2 - a2 * b1
    // | a2 b2|
    double d = a1 * b2 - a2 * b1;
    // Dx = | c1 b1| = c1*b2 - c2 * b1
    // | c2 b2|
    double dx = c1 * b2 - c2 * b1;
    // Dy = |a1 a1 | = a1*c2 - a2 * c1
    // |a2 c2 |
    double dy = a1 * c2 - a2 * c1;

    // if D != 0 line 1 and line 2 not intersecting
    // else if (Dx==0 && Dy==0)line 1 and line 2 have infinite
    //
    // else line 1 and 2 not intersecting
    if (Math.abs(d) > EPSILON) {
      double intersectX = dx / d;
      double intersectY = dy / d;
      System.out.println("Intersecting point is " + intersectX + ":" + intersectY);
    } else if (Math.abs(dx) < EPSILON && Math.abs(dy) < EPSILON) {
      System.out.println("Line 1 and 2 is the same");
    } else {
      System.out.println("Line 1 and 2 are parallel");
    }

    // Close Scanner
    input.close();
  }
}
