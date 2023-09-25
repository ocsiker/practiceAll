/*
 * this comment
 */
package main.scannersample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class ScannerLocal {
  public static void main(String[] args) {
    Scanner scanner = null;

    double dbl = 0;
    System.out.println(Locale.getDefault().getDisplayCountry());
    String thisString = "try this noa";
    System.out.println(thisString);
    try {
      scanner = new Scanner(new BufferedReader(new FileReader("./doubleLocal")));
      scanner.useLocale(Locale.US);
      while (scanner.hasNext()) {
        if (scanner.hasNextDouble()) {
          dbl += scanner.nextDouble();
        } else {
          scanner.next();
        }
      }
      System.out.println(dbl);
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      if (scanner != null) {
        scanner.close();
      }
    }
    System.out.println("value");
    /*
     *
     */
  }
}
