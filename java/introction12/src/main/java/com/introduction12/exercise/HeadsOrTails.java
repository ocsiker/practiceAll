public class HeadsOrTails {
  public static void main(String[] args) {
    int numberOfHead = 0;
    int numberOfTail = 0;
    for (int i = 0; i < 1000000; i++) {
      // if generate even number plus for head
      // else plus for tail
      if ((int) (Math.random() * 10) % 2 == 0) {
        numberOfHead++;
      } else {
        numberOfTail++;
      }
    }
    System.out.println("The number of head and tail after one million times is: ");
    System.out.printf("%-8s%-8s\n", "Head", "Tail");
    System.out.printf("%-8d%-8d\n", numberOfHead, numberOfTail);
  }
}
