import java.util.ArrayList;
import java.util.List;

public class Professor extends Person implements Grading {
    private List<Course> pCourses;

    public Professor(String id, String name, String email) {
        super(id, name, email);
        this.pCourses = new ArrayList<>();
    }

    // Add a course to the professor's list
    public void addCourse(Course c) {
        pCourses.add(c);
    }

    // Get all courses taught by the professor
    public List<Course> getCourses() {
        return pCourses;
    }

    @Override
    public void assignGrade(Student s, Course c, double grade) {
        if (pCourses.contains(c)) {
            System.out.println("Professor " + name + " assigned grade " + grade +
                               " to " + s.getName() + " in " + c.courseName);
        } else {
            System.out.println("Professor " + name + " does not teach " + c.courseName);
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Professor: " + name + " (" + id + ")");
        if (!pCourses.isEmpty()) {
            System.out.println("Courses taught:");
            for (Course c : pCourses) {
                c.getCourseInfo();
            }
        } else {
            System.out.println("No courses assigned yet.");
        }
    }
}
