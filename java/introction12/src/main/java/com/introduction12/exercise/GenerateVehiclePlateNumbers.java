package com.introduction12.exercise;

public class GenerateVehiclePlateNumbers {
  public static void main(String[] args) {
    // Vehicle plate numbers consists of three upper letters followed by four
    // digits.
    //
    String vehiclePlateNumbers = "";
    int totalCharacters = 7;
    while (totalCharacters > 0) {
      if (totalCharacters > 4) {
        // Generate three upper letters A-Z (ascii 65 - 90)
        vehiclePlateNumbers += Character.toString((char) ((int) (Math.random() * 26) + 65));
      } else {
        // Generate four digits in range 0 - 9
        vehiclePlateNumbers += Integer.toString((int) (Math.random() * 9));
      }
      totalCharacters -= 1;
    }
    System.out.println("The vehicle plate numbers is: " + vehiclePlateNumbers);

  }
}
