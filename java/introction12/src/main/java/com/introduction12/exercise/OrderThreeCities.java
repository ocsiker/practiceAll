public class OrderThreeCities {
  public static void main(String[] args) {
    // Create a Scanner
    java.util.Scanner input = new java.util.Scanner(System.in);
    // Prompt the user to
    // Enter the first city:
    System.out.print("Enter the first city: ");
    String firstCity = input.nextLine();
    // Enter the second city:
    System.out.print("Enter the second city: ");
    String secondCity = input.nextLine();
    // Enter the third city:
    System.out.print("Enter the third city: ");
    String thirdCity = input.nextLine();
    //
    // Display the three cities in alphabetical order are
    // if the firstCity < secondCity and firstCity < thirdCity
    //
    System.out.print("The three cities in alphabetical order are ");
    if (firstCity.compareToIgnoreCase(secondCity) < 0) {
      if (firstCity.compareToIgnoreCase(thirdCity) < 0) {
        // order firstCity < secondCity < thirdCity
        if (secondCity.compareToIgnoreCase(thirdCity) < 0) {
          System.out.println(firstCity + " " + secondCity + " " + thirdCity);
        } else {
          // order firstCity < thirdCity < secondCity
          System.out.println(firstCity + " " + thirdCity + " " + secondCity);
        }
      } else {
        // oder thirdCity < firstCity < secondCity
        System.out.println(thirdCity + " " + firstCity + " " + secondCity);
      }
    } else {
      // secondCity < firstCity
      if (secondCity.compareToIgnoreCase(thirdCity) < 0) {
        if (firstCity.compareToIgnoreCase(thirdCity) < 0) {
          // secondCity < firstCity < thirdCity
          System.out.println(secondCity + " " + firstCity + " " + thirdCity);
        } else {
          // secondCity < thirdCity < firstCity
          System.out.println(secondCity + " " + thirdCity + " " + firstCity);
        }
      } else {
        // thirdCity < secondCity
        System.out.println(thirdCity + " " + secondCity + " " + firstCity);
      }
    }

    // Close the Scanner
    input.close();
  }
}
