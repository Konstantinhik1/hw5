import Service.StudyGroupService;
import model.Student;
import model.StudyGroup;
import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupController {
    // Метод для формирования учебной группы
    public static StudyGroup formStudyGroup(Teacher teacher, List<Student> students) {
        // Вызываем метод из сервиса для формирования учебной группы
        return StudyGroupService.createFormedStudyGroup(teacher, students);
    }

    public static void main(String[] args) {
        // Пример использования:
        Teacher teacher = new Teacher("John", "Doe");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Peter", "Smith", 1));
        students.add(new Student("Alice", "Johnson", 2));

        // Вызываем метод контроллера для формирования учебной группы
        StudyGroup group = formStudyGroup(teacher, students);

        // Выводим информацию о созданной группе
        System.out.println("Учитель: " + group.getTeacher().getFirstName() + " " + group.getTeacher().getLastName());
        System.out.println("Студенты:");
        for (Student student : group.getStudentList()) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }
}