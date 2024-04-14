package Service;

import java.util.List;
import model.Student;
import model.StudyGroup;
import model.Teacher;

public class StudyGroupService {
    public static StudyGroup createFormedStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }

    public static void main(String[] args) {
        // Example usage:
        Teacher teacher = new Teacher("John", "Doe");
        List<Student> students = List.of(
                new Student("Peter", "Smith", 1),
                new Student("Alice", "Johnson", 2)
        );

        StudyGroup formedGroup = createFormedStudyGroup(teacher, students);

        System.out.println("Teacher: " + formedGroup.getTeacher().getFirstName() + " " +
                formedGroup.getTeacher().getLastName());
        System.out.println("Students:");
        for (Student student : formedGroup.getStudentList()) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " - " + student.getStudentNumber());
        }
    }
}
