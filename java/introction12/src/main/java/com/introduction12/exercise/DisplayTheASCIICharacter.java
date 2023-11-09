public class DisplayTheASCIICharacter {
  public static void main(String[] args) {
    // Display the leter from ! (33) to tiling ~ (126)
    int count = 1;
    for (int i = 33; i < 127; i++) {
      if (count % 10 == 0) {
        System.out.println();// print neww line
        count++;// increase the members in a line
        System.out.print((char) (i));
      } else {
        System.out.print((char) i);
        count++;
      }

    }
  }
}
