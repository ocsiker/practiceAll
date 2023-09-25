/** this is main student management Program */
import java.io.IOException;
import java.util.ArrayList;
import student.*;

public class StudentManagement {
  public static void main(String[] args) throws IOException {
    ArrayList<Student> students = new ArrayList<Student>();

    Student a = new Student("14142334", "thoaA");
    students.add(new Student("12475687", "thang"));
    students.add(new Student("12245788", "thoa"));
    students.add(a);
    for (int i = 0; i < students.size(); i++) {
      System.out.println(students.get(i).getId());
    }

    // String fileName = args[0];
    //

    // CSVReader csvReader = new CSVReader(reader, separator, quotechar, escape, line, strictQuotes)
    // Student st1 = new Student();
    // st1.setId("123456676");
    // Student st2 = new Student();
    // st2.setId("12345677");
    // String idSt2 = st2.getId();
    // System.out.println(idSt2);

    // String show = " ";
    // st.setName("123");
    // show = st.getName();
    // st1.setName("32jflajs");
    // show = st1.getName();
    // st2.setName("thang huynh");
    // show = st2.getName();
    // System.out.println(show);

    // st.setGPA("213");
    // st.setGPA("-3.4");
    // st.setGPA("0.4");
    // System.out.println(st.getGPA());
    // st.setGPA("5");
    // System.out.println(st.getGPA());
    // st.setGPA("7");
    // System.out.println(st.getGPA());
    // st.setGPA("10");
    // System.out.println(st.getGPA());
    // st.setGPA("falsjfla");
    // System.out.println(st.getGPA());
    // st.setGPA("10af");
    // System.out.println(st.getGPA());
    // st.setGPA("213");

    // st.setAddress("424 huynh van banh AP 434342");
    // st1.setAddress("flasjf ljf a");
  }
}
