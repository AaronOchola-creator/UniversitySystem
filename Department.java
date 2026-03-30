import java.io.*;
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

    public void saveStudentsToFile(String filename) {
        try (FileWriter fw = new FileWriter(filename)) {
            for (Student s : students) {
                fw.write(s.getId() + "," + s.getName() + "," + s.email + "\n");
            }
            System.out.println("Students saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving students: " + e.getMessage());
        }
    }

    public void loadStudentsFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    Student s = new Student(parts[0], parts[1], parts[2]);
                    students.add(s);
                }
            }
            System.out.println("Students loaded from " + filename);
        } catch (IOException e) {
            System.out.println("Error loading students: " + e.getMessage());
        }
    }

    public void displayDepartmentInfo() {
        System.out.println("Department: " + deptName);
        System.out.println("Students: " + students.size());
        System.out.println("Professors: " + professors.size());
        System.out.println("Courses: " + courses.size());
    }
}