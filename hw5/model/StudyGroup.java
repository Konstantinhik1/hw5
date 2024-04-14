package model;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private ArrayList<Student> studentList;

    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.studentList = (ArrayList<Student>) students;
    }

    // Getters and setters for teacher and student list
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
}
