package model;

public class Student {
    private String firstName;
    private String lastName;
    private int studentNumber;

    public Student(String firstName, String lastName, int studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }

    // Getters and setters for first name, last name, and student number of the student
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}
