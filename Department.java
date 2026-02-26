import java.util.ArrayList;
import java.util.List;

public class Department {
    private String deptName;
    private List<Student> students;
    private List<Professor> professors;
    private List<Course> courses;

    public Department(String deptName) {
        this.deptName = deptName;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student s) { students.add(s); }
    public void addProfessor(Professor p) { professors.add(p); }
    public void addCourse(Course c) { courses.add(c); }

    public void displayDepartmentInfo() {
        System.out.println("Department: " + deptName);
        System.out.println("Students: " + students.size());
        System.out.println("Professors: " + professors.size());
        System.out.println("Courses: " + courses.size());
    }
}