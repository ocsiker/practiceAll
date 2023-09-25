package main.password;

import java.io.Console;
import java.util.Arrays;

public class Password {
  static final String orLogin = "ocsiker";
  static final char[] orPassword = {'1', '2', '3', '4', '5', '6'};

  public static void main(String[] args) {
    Console c = System.console();
    if (c == null) {
      System.err.println("No cosole");
      System.exit(1);
    }

    String login = c.readLine("Enter your login:");
    char[] oldPassword = c.readPassword("Enter your old password:");
    if (verify(login, oldPassword)) {
      boolean noMath;
      do {

        char[] newPassword1 = c.readPassword("Enter your new password:");
        char[] newPassword2 = c.readPassword("Enter your new password again:");
        noMath = !Arrays.equals(newPassword1, newPassword2);
        if (noMath) {
          c.format("Passwords don't match, Try again %n");
        } else {
          change(login, newPassword1);
          c.format("Password for %s changed.%n", login);
        }
        Arrays.fill(newPassword1, ' ');
        Arrays.fill(newPassword2, ' ');
      } while (noMath);
    }
    Arrays.fill(oldPassword, ' ');
  }

  static boolean verify(String login, char[] password) {
    // return true;
    // if (login.equals(orLogin) && password.equals(orPassword)) {
    if (login.equals(orLogin)) {
      return true;
    } else return false;
  }

  static void change(String login, char[] password) {}
}
