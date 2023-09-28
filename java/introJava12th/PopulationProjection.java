public class PopulationProjection {
  public static void main(String[] args) {
    // current population
    long currentPopulation = 312032486;
    // Time for one birth one death one immigrant every on unit second
    int oneBirthTime = 7;
    int oneDeathTime = 13;
    int oneNewImmigrant = 45;

    // Create Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter the number of years
    System.out.println("Enter the number of years:");
    int years = input.nextInt();

    // The amount seconds in 5 years
    long amountsSecondInFiveYears = years * 365 * 24 * 60 * 60;
    double amountPersonInSecond = 1.0 / oneBirthTime - 1.0 / oneDeathTime + 1.0 / oneNewImmigrant;
    long fiveYearsPopulations =
        currentPopulation + (long) (amountPersonInSecond * amountsSecondInFiveYears);
    System.out.println("Population in Five years later: " + fiveYearsPopulations);
  }
}
