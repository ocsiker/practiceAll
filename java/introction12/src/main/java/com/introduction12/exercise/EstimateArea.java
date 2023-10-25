public class GreatCircleDistance {
  public static void main(String[] args) {
    // RADIUS OF THE EARTH
    final double RADIUS = 6371.01;
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Latitude longitude for 4 cities
    // Charlotte(35.2270869, -80.843267)
    double xCharlotte = 35.2270869;
    double yCharlotte = -80.843267;
    // Atlanta(33.7489954, -84.3879824)
    double xAtlanta = 33.7489954;
    double yAtlanta = -84.3879824;
    // Savannah(32.0835407, -81.0998342)
    double xSavannah = 32.0835407;
    double ySavannah = -81.0998342;
    // Orlando(28.5383355, -81.3792365)
    double xOrlando = 28.5383355;
    double yOrlando = -81.3792365;
    // Compute the distance between the two point is
    // double distance = RADIUS
    // * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
    // Math.cos(Math.toRadians(x1))
    // * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1) -
    // Math.toRadians(y2)));
    // Distance between Charlotte and Atlanta
    double distanceCharlotteAndAtlanta = RADIUS
        * Math.acos(Math.sin(Math.toRadians(xCharlotte)) * Math.sin(Math.toRadians(xAtlanta))
            + Math.cos(Math.toRadians(xCharlotte))
                * Math.cos(Math.toRadians(xAtlanta)) * Math.cos(Math.toRadians(yCharlotte) - Math.toRadians(yAtlanta)));
    // Distance Charlotte and Savannah
    double distanceCharlotteAndSanvannah = RADIUS
        * Math.acos(Math.sin(Math.toRadians(xCharlotte)) * Math.sin(Math.toRadians(xSavannah))
            + Math.cos(Math.toRadians(xCharlotte))
                * Math.cos(Math.toRadians(xSavannah))
                * Math.cos(Math.toRadians(yCharlotte) - Math.toRadians(ySavannah)));
    // Distance Atlanta and Orlando
    double distanceAtlantaAndOrlando = RADIUS
        * Math.acos(Math.sin(Math.toRadians(xAtlanta)) * Math.sin(Math.toRadians(xOrlando))
            + Math.cos(Math.toRadians(xAtlanta))
                * Math.cos(Math.toRadians(xOrlando))
                * Math.cos(Math.toRadians(yAtlanta) - Math.toRadians(yOrlando)));
    // Distance Atlanta and Savannah
    double distanceAtlantaAndSavannah = RADIUS
        * Math.acos(Math.sin(Math.toRadians(xAtlanta)) * Math.sin(Math.toRadians(xSavannah))
            + Math.cos(Math.toRadians(xAtlanta))
                * Math.cos(Math.toRadians(xSavannah))
                * Math.cos(Math.toRadians(yAtlanta) - Math.toRadians(ySavannah)));
    // Distance Savannah and Orlando
    double distanceSavannahAndOrlando = RADIUS
        * Math.acos(Math.sin(Math.toRadians(xSavannah)) * Math.sin(Math.toRadians(xOrlando))
            + Math.cos(Math.toRadians(xSavannah))
                * Math.cos(Math.toRadians(xOrlando))
                * Math.cos(Math.toRadians(ySavannah) - Math.toRadians(yOrlando)));
    // double distance = RADIUS
    // * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
    // Math.cos(Math.toRadians(x1))
    // * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1) -
    // Math.toRadians(y2)));
    // double distance = RADIUS
    // * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
    // Math.cos(Math.toRadians(x1))
    // * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1) -
    // Math.toRadians(y2)));
    // double distance = RADIUS
    // * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
    // Math.cos(Math.toRadians(x1))
    // * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1) -
    // Math.toRadians(y2)));
    // Close the Scanner
    input.close();
  }
}
