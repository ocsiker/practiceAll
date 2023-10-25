public class RandomPointsOnCircle {
  public static void main(String[] args) {
    // Constant radius and center
    // RADIUS = 40 and center (0, 0)
    final int RADIUS = 40;

    //
    // Random value of circle
    double radomRadian = Math.random() * Math.PI * 2;

    // Coordinate of x1,y1 point A
    double x1 = RADIUS * Math.cos(radomRadian);
    double y1 = RADIUS * Math.sin(radomRadian);
    radomRadian = Math.random() * Math.PI * 2;
    // Coordinate of x2,y2 point B
    double x2 = RADIUS * Math.cos(radomRadian);
    double y2 = RADIUS * Math.sin(radomRadian);
    radomRadian = Math.random() * Math.PI * 2;
    // Coordinate of x3,y3 point C
    double x3 = RADIUS * Math.cos(radomRadian);
    double y3 = RADIUS * Math.sin(radomRadian);
    //
    // Distance A - B
    double lengthAB = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    // Distance A - C
    double lengthAC = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
    // Distance B - C
    double lengthBC = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
    // Cosin of rectangle A B C
    double cosA = (Math.pow(lengthAB, 2) + Math.pow(lengthAC, 2) - Math.pow(lengthBC, 2)) / (2 * lengthAC * lengthAB);
    double cosB = (Math.pow(lengthAB, 2) + Math.pow(lengthBC, 2) - Math.pow(lengthAC, 2)) / (2 * lengthAB * lengthBC);
    double cosC = (Math.pow(lengthAC, 2) + Math.pow(lengthBC, 2) - Math.pow(lengthAB, 2)) / (2 * lengthAC * lengthBC);

    // Convert cos rectangle to degree
    double recInDegreeA = Math.toDegrees(Math.acos(cosA));
    double recInDegreeB = Math.toDegrees(Math.acos(cosB));
    double recInDegreeC = Math.toDegrees(Math.acos(cosC));

    System.out.println("x1 y1 x2 y2 x3 y3: " + x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3);
    System.out.println("Length of AB AC BC : " + lengthAB + " " + lengthAC + " " + lengthBC);
    System.out.println("Rectangle A B C " + recInDegreeA + " " + recInDegreeB + " " + recInDegreeC);

  }
}
