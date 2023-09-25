// this is student list
//
package student;

import java.util.ArrayList;

public class StudentList {

  private ArrayList<Student> students = new ArrayList<Student>();

  private void createStudentList() {
    Student st = new Student();
    students.add(st);
    for (Student student : students) {}
    // false id avaibale
    //   if (Pattern.matches("\\d{8}", id)) {
    //     // check id has used
    //     for (Student student : students) {
    //       if (student.getId().equals(id)) {
    //         System.out.println("Id is used");
    //         flag = true;
    //         break;
    //       }
    //     }
    //     // flag ==false id avaibale
    //     if (!flag) {
    //
    //       this.id = id;
    //     }
    //
    //   } else {
    //
    //     this.showErrId();
    //   }
    // }
    // }

  }
}
