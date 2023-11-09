public class FindTheTwoHighestScores {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // prompt the user to enter name and score
    // To stop press enter
    String name = "";
    String nameHasHighestScore = "";
    String nameHas2ndScore = "";
    String score = "0";
    String scoreHighest = "0";
    String score2nd = "0";
    System.out.println("Enter the name and the score of students (q for quit)");
    for (; input.hasNext();) {
      name = input.next();// enter name of student
      if (name.equals("q")) {

        break;// break when empty input
      }
      score = input.next();// enter score of student
      if (Double.parseDouble(score) > Double.parseDouble(scoreHighest)) {
        // swap score highest with score input
        String tempScore = scoreHighest;
        String tempName = nameHasHighestScore;
        scoreHighest = score;
        nameHasHighestScore = name;
        score = tempScore;
        name = tempName;
      }
      if (Double.parseDouble(score) > Double.parseDouble(score2nd)) {
        // swap score 2nd high with score input
        String tempScore = score2nd;
        String tempName = nameHas2ndScore;
        score2nd = score;
        nameHas2ndScore = name;
        score = tempScore;
        name = tempName;
      }

    }

    // Display the highest and 2nd high score
    System.out.println("The highest score name is: " + nameHasHighestScore + " and score is : " + scoreHighest);
    System.out.println("The highest score name is: " + nameHas2ndScore + " and score is : " + score2nd);
  }
}
