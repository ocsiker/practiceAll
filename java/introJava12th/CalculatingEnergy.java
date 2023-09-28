public class CalculatingEnergy {
  public static void main(String[] args) {
    // Create Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Enter the amount of water in kilograms
    // initial and final temperatures of the water (degrees Celsius).
    // Q = M*( finalTemperatures - initialTemperatures)*4184
    //
    System.out.println("Enter the amount of water in kilograms: ");
    double amountOfWater = input.nextDouble();
    System.out.println("Enter initial temperatures: ");
    double initialTemperatures = input.nextDouble();
    System.out.println("Enter final temperatures: ");
    double finalTemperatures = input.nextDouble();

    // Compute quantity of heat
    double Q = amountOfWater * (finalTemperatures - initialTemperatures) * 4184;

    // Display output
    System.out.println("The energy needed is : " + Q);
    input.close();
  }
}
