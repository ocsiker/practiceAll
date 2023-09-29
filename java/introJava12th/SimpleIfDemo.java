public class SimpleIfDemo {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user enter integer
    System.out.println("Enter a integer:");

    int number = input.nextInt();

    if (number % 5 == 0) {
      System.out.println("HiFive");
    }
    if (number % 2 == 0) System.out.println("hi Even");
  }
}
