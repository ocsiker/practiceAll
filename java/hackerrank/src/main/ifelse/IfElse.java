package main.ifelse;

/*
 *Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.
 *
 * */
public class IfElse {
  public static void main(String[] args) {
    IfElse ie = new IfElse();
    ie.trigger();
    ie.toString();
  }

  public void name() {
    System.out.println("shotting");
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    System.out.println("override to_string");
    return super.toString();
  }

  public void trigger() {

    this.name();
  }
}
