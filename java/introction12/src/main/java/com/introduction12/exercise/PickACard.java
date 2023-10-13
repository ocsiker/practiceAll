public class PickACard {
  public static void main(String[] args) {
    // random rank in (Ace, 2, .., 10, Jack, Queen, King)
    int rank = (int) (Math.random() * 12) + 1;
    // radom the suit in Clubs, Diamonds, Hearts, Spades
    int suit = (int) (Math.random() * 3) + 1;

    System.out.print("The card you pick is ");
    switch (rank) {
      case 1:
        System.out.print(" Ace ");
        break;
      case 2:
        System.out.print("2");
        break;
      case 3:
        System.out.print("3");
        break;
      case 4:
        System.out.print("4");
        break;
      case 5:
        System.out.print("5");
        break;
      case 6:
        System.out.print("6");
        break;
      case 7:
        System.out.print("7");
        break;
      case 8:
        System.out.print("8");
        break;
      case 9:
        System.out.print("9");
        break;
      case 10:
        System.out.print("10");
        break;
      case 11:
        System.out.print("Jack");
        break;
      case 12:
        System.out.print("Queen");
        break;
      case 13:
        System.out.print("King");
        break;
      default:
        break;
    }

    System.out.print(" of ");
    switch (suit) {
      case 1:
        System.out.println("Clubs");
        break;
      case 2:
        System.out.println("Diamonds");
        break;
      case 3:
        System.out.println("Hearts");
        break;
      case 4:
        System.out.println("Spades");
        break;

      default:
        break;
    }
  }
}
