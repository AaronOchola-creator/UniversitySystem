import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private double averageGrade;
    private List<Course> sCourses;

    public Student(String id, String name, String email) {
        super(id, name, email);
        this.sCourses = new ArrayList<>();
    }

    public void registerCourse(Course c) {
        sCourses.add(c);
    }

    public double calculateAverageGrade() {
        return averageGrade; 
    }

    @Override
    public void displayDetails() {
        System.out.println("Student: " + name + " (" + id + ")");
    }
}
