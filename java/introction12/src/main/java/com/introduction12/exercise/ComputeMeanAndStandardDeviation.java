public class ComputeMeanAndStandardDeviation {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to Enter
    // Enter 10 numbers
    System.out.print("Enter 10 numbers: ");
    double number, mean = 0, deviation = 0, sumOfTenNumbers = 0, sumOfPowerTenNumbers = 0;
    for (int i = 0; i < 10; i++) {
      number = input.nextDouble();
      // sumOfTenNumbers = x1 + x2 + ... + x10;
      sumOfTenNumbers += number;
      // sumOfPowerTenNumbers= x1^2 + x2^2 + ... + x10^2;
      sumOfPowerTenNumbers += Math.pow(number, 2);
    }

    // compute mean
    mean = sumOfTenNumbers / 10;
    // compute deviation
    deviation = Math.sqrt((sumOfPowerTenNumbers - Math.pow(sumOfTenNumbers, 2) / 10) / (10 - 1));

    System.out.println("The mean is : " + mean);
    System.out.println("The standard deviation is :  " + deviation);
  }
}
