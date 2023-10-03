public class FindFutureDates {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to
    //
    // Enter the today's day
    // Sunday is 0, Monday is 1,..., and Saturday is 6
    System.out.print("Enter the today's day: ");
    int day = input.nextInt();
    // Enter the number of days elapsed sice today:
    System.out.print("Enter the number of days elapsed sice today: ");
    int elapsedDay = input.nextInt();

    System.out.print("Today is ");
    switch (day) {
      case 0:
        System.out.print("Sunday");
        break;
      case 1:
        System.out.print("Monday");
        break;
      case 2:
        System.out.print("Tuesday");
        break;
      case 3:
        System.out.print("Wednesday");
        break;
      case 4:
        System.out.print("Thursday");
        break;
      case 5:
        System.out.print("Friday");
        break;
      case 6:
        System.out.print("Saturday");
        break;
    }

    int nextDay = (day + elapsedDay) % 7;

    System.out.print(" and the future day is ");
    switch (nextDay) {
      case 0:
        System.out.print("Sunday");
        break;
      case 1:
        System.out.print("Monday");
        break;
      case 2:
        System.out.print("Tuesday");
        break;
      case 3:
        System.out.print("Wednesday");
        break;
      case 4:
        System.out.print("Thursday");
        break;
      case 5:
        System.out.print("Friday");
        break;
      case 6:
        System.out.print("Saturday");
        break;
    }

    System.out.print("\n");
    input.close();
  }
}
