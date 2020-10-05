import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentPrinter {
    public static void main(String[] args) {

        Student student1 = new Student("Cedric Don", "Coloma", 22, "male", "2020-02-259265");
        Student student2 = new Student("Apple", "Dela Cruz", 21, "female", "2020-01-12345");
        Student student3 = new Student("Shana", "Mercado", 24, "male", "2020-05-234567");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for(Student student: students) {
            System.out.println("First Name: " + student.getFirstName());
            System.out.println("Last Name: " + student.getLastName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Gender: " + student.getGender());
            System.out.println("ID NO: " + student.getIdNo());
            System.out.println("-------------------------");
        }
    }
}
