public class ComputingBMI {
  public static void main(String[] args) {
    // Create Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    // Enter weight in pounds
    System.out.print("Enter weight in pound ");
    double weightInPounds = input.nextDouble();
    // Enter height in inches
    System.out.print("Enter height in inches ");
    double heigthInInches = input.nextDouble();

    // Convert weight in pounds to weight in kilograms
    double weightInKilograms = weightInPounds * 0.45359237;
    // Convert height in inches to height in to meters
    double heightInMeters = heigthInInches * 0.0254;

    // Compute BMI by taking weight in kilograms and dividing by the square of
    // height in meters

    double BMI = weightInKilograms / Math.pow(heightInMeters, 2);

    // Display output surround by four digits
    System.out.println("BMI is " + (int) (BMI * 10000) / 10000.0);

    input.close();
  }
}
