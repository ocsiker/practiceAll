public class ComputeInterpretBMI {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Constant value kilograms to pound
    final double KILOGRAMS_PER_POUND = 0.4535;
    // Constant value meters to inche
    final double METERS_PER_INCH = 0.0254;

    // Prompt the user to
    // Enter weight in pounds
    System.out.print("Enter weight in pounds:");
    double weightInPounds = input.nextDouble();
    // Enter height in inches
    System.out.print("Enter height in inches:");
    double heightInInches = input.nextDouble();
    //
    // Compute BMI by weight(in kilograms ) divide the square of height in
    // meters
    //
    double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
    double heightInMeters = heightInInches * METERS_PER_INCH;
    double BMI = weightInKilograms / (heightInMeters * heightInMeters);
    // Display interpret
    // BMI < 18.5 --> Underweight
    // 18.5 =<BMI < 25.0 --> Normal
    // 25.0 =<BMI < 30.0 --> Overweight
    // 30.0 =< BMI --> Obese
    System.out.println("BMI is: " + BMI);
    if (BMI < 18.5) {
      System.out.println("Underweight");
    } else if (BMI < 25.0) {
      System.out.println("Normal");
    } else if (BMI < 30) {
      System.out.println("Overweight");
    } else {
      System.out.println("Obese");
    }
    input.close();
  }
}
