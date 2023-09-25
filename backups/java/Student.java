/** this is student management program */
package student;

import java.util.regex.Pattern;

public class Student {
  private String id;
  private String name;
  private Double gpa;
  private String image;
  private String address;
  private String notes;

  public void setId(String id) {
    // still not check incident id
    if (Pattern.matches("\\d{8}", id)) {
      this.id = id;
    } else {
      this.showErrId();
    }
  }

  void showErr() {
    System.out.println("Error! ");
  }

  void showErrId() {
    this.showErr();
    System.out.println("Id must string include 8 numbers.");
  }

  public void setName(String name) {
    if (Pattern.matches("[a-zA-Z\s]+", name)) {
      this.name = name;
    } else {
      this.showErrName();
    }
  }

  void showErrName() {
    this.showErr();
    System.out.println("Name must string!");
  }

  public void setGPA(String gpa) {
    if (Pattern.matches("^[0-9]+(\\.[0-9]+)?$", gpa)) {
      if (Double.parseDouble(gpa) <= 10) {
        this.gpa = Double.parseDouble(gpa);
      }
    } else {
      this.showErrGPA();
    }
  }

  void showErrGPA() {
    this.showErr();
    System.out.println("GPA is a number between 0-10");
  }

  public void setImage(String image) {
    // still not check image
    this.image = image;
  }

  public void setAddress(String address) {
    if (Pattern.matches(
        "^(\\d{1,}) [a-zA-Z0-9\\s]+(\\,)? [a-zA-Z]+(\\,)? [A-Z]{2} [0-9]{5,6}$", address)) {
      this.address = address;
    } else {
      this.showErr();
      this.showErrAddress();
    }
  }

  void showErrAddress() {
    System.out.println(
        "Address format like:number street district zipcode(2 UPPERCASES characters and 5-6"
            + " numbers) ");
  }

  public void setNotes(String notes) {}

  public String getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public Double getGPA() {
    return this.gpa;
  }

  public String getImage() {
    return this.image;
  }

  public String getAddress() {
    return this.address;
  }

  public String getNotes() {
    return this.notes;
  }

  public Student(String id, String name, Double gpa, String image, String address, String notes) {
    this.setId(id);
    this.setName(name);
    this.setGPA(String.valueOf(gpa));
    this.setImage(image);
    this.setAddress(address);
    this.setNotes(notes);
  }

  public Student(String id, String name) {
    this.setId(id);
    this.setName(name);
  }

  public Student() {}
}
