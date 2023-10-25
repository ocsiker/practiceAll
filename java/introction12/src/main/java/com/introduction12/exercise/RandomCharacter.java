public class RandomCharacter {
  public static void main(String[] args) {
    // Generate integer number from 65 to 90
    // correspoding with letter A to Z in ASCII
    int number = (int) (Math.random() * (90 - 65 + 1) + 65);

    System.out.println("The letter is: " + (char) number);
  }
}
