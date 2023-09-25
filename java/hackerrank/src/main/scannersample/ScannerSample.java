/* link
 https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=false
Task
In this challenge,
you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.
*/

package main.scannersample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerSample {
  public static void main(String[] args) {
    Scanner scanner = null;

    try {
      scanner = new Scanner(new BufferedReader(new FileReader("textfile")));
      while (scanner.hasNext()) {
        System.out.println(scanner.next());
      }
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      if (scanner != null) {
        scanner.close();
      }
    }
  }
}
