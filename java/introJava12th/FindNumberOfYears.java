import java.util.Scanner;

public class FindNumberOfYears {
  public static void main(String[] args) {
    // Create Scanner
    Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to enter the minutes
    // Enter the minutes to compute
    System.out.println("Enter minutes amount: ");
    long minutes = input.nextLong();

    // 1 year have yearMinute= 365 * 24 * 60 (minutes)
    // x ==> years
    // x* yearMinute = minutes + y
    // days remaining and years
    // minutes % (365 * 24 * 60) --> minutes remaining --> days --> minutes
    long days = (minutes % (365 * 24 * 60)) / (24 * 60);
    int years = (int) (minutes / (365 * 24 * 60));

    // Display output
    System.out.println(minutes + " minutes is approximately " + years + " years " + days + " days");
  }
}
