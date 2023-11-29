public class Combinations {
  public static void main(String[] args) {
    int countCombinations = 0;
    for (int i = 1; i < 8; i++) {
      for (int j = i + 1; j < 8; j++) {
        countCombinations++;

        System.out.printf("%-2d%d\n", i, j);

      }
    }
    System.out.println("The total number of all combinations is: " + countCombinations);
  }
}
