public class WindChillTemperature {
  public static void main(String[] args) {
    // Create Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt user to
    // Enter the temperature in Fahenreit between -58\u00B0 F and 41\u00B0 F:
    System.out.print(
        "Enter the temperature in Fahenreit between -58\u00B0 F and 41\u00B0 F: ");
    double temperatureOutside = input.nextDouble();

    // Enter the wind speed ( v >= 2 ) in miles per hour:
    //
    System.out.print("Enter the wind speed ( v >= 2 ) in miles per hour: ");
    double windSpeed = input.nextDouble();

    // Compute wind chill temperature
    // by WindChillTemperature = 35.74 +  0.6125*temperatureOutside -35.75 *
    // pow(windSpeed,0.16) + 0.4275 * temperatureOutside * pow(windSpeed,0.16)
    double windChillTemperature =
        35.74 + 0.6215 * temperatureOutside -
        35.75 * Math.pow(windSpeed, 0.16) +
        0.4275 * temperatureOutside * Math.pow(windSpeed, 0.16);

    // Display wind chill index surrounded by 6 digits
    System.out.println("Wind chill index is " +
                       (int)(windChillTemperature * 1000000) / 1000000.0);

    // Close Scanner
    input.close();
  }
}
