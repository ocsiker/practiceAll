import java.util.Scanner;

public class DisplayTime {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // prompt the user for input
    System.out.println("Input seconds to change: ");
    int seconds = input.nextInt();

    // find minutes in seconds

    int minutes = seconds / 60;

    // find hours in minutes
    // int hours = minutes/60;

    int remainingSeconds = seconds % 60;

    System.out.println(
        seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds ");
    input.close();
  }
}
