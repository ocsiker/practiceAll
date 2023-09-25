package main.DateTimeSample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/** DateTime */
public class DateTime {

  public static void main(final String[] args) {
    System.out.println("hello world");
    Dog dog = new Dog();

    dog.name("Mixu");
    dog.name("Mehi");
    dog.bark();
    Cat cat = new Cat();
    try {

      cat.readFile();
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println(e);
      System.out.println("value off the ");
    }
  }
}

class animal {
  public void bark() {
    System.out.println("bark");
  }
}

// TODO add more function to move
class Dog extends animal {
  public void name(final String name) {
    System.out.println("printing name " + name);
  }

  @Override
  public void bark() {
    // TODO Auto-generated method stub
    // super.bark();
    System.out.println("dog bark");
  }
}

class Cat {
  public void readFile() throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("fin"));

    String str = br.readLine();
    System.out.println(str);

    br.close();
  }
}
