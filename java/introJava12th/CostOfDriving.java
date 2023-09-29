public class CostOfDriving {
  public static void main(String[] args) {
    // Create Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Enter the driving distance:
    System.out.print("Enter the driving distance: ");
    double distance = input.nextDouble();
    // Enter miles per gallon:
    System.out.print("Enter miles per gallon: ");
    double milesPerGallon = input.nextDouble();
    // Enter pric per gallon:
    System.out.print("Enter price per gallon: ");
    double pricePerGallon = input.nextDouble();

    // Compute the cost of driving by distance / milesPerGallon * pricePerGallon
    double costOfDriving = distance / milesPerGallon * pricePerGallon;

    // Display Cost of driving
    System.out.println("The cost of driving is " + (int) (costOfDriving * 100) / 100.0);
    // Close input
    input.close();
  }
}
