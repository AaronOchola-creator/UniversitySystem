import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Get Student details dynamically
            System.out.print("Enter Student ID: ");
            String sid = sc.nextLine();
            System.out.print("Enter Student Name: ");
            String sname = sc.nextLine();
            System.out.print("Enter Student Email: ");
            String semail = sc.nextLine();

            Student s1 = new Student(sid, sname, semail);

            // Get Professor details dynamically
            System.out.print("Enter Professor ID: ");
            String pid = sc.nextLine();
            System.out.print("Enter Professor Name: ");
            String pname = sc.nextLine();
            System.out.print("Enter Professor Email: ");
            String pemail = sc.nextLine();

            Professor p1 = new Professor(pid, pname, pemail);

            // Get Course details dynamically
            System.out.print("Enter Course Code: ");
            String ccode = sc.nextLine();
            System.out.print("Enter Course Name: ");
            String cname = sc.nextLine();

            ConcreteCourse c1 = new ConcreteCourse(ccode, cname);

            // Assign course to professor
            p1.addCourse(c1);

            // Register student to course
            s1.registerCourse(c1);

            // Enter grade safely
            System.out.print("Enter grade for student: ");
            double grade = 0.0;
            try {
                grade = Double.parseDouble(sc.nextLine());
                p1.assignGrade(s1, c1, grade);
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade input. Please enter a numeric value.");
            }

            // Create Department and add entities
            Department dept = new Department("Computer Science");
            dept.addStudent(s1);
            dept.addProfessor(p1);
            dept.addCourse(c1);

            // Display details
            System.out.println("\n=== Current Department Info ===");
            s1.displayDetails();
            p1.displayDetails();
            c1.getCourseInfo();
            dept.displayDepartmentInfo();

            // Save students to file
            dept.saveStudentsToFile("students.txt");

            // Reload students from file
            System.out.println("\n=== Reloading Students from File ===");
            dept.loadStudentsFromFile("students.txt");
            dept.displayDepartmentInfo();

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Program finished safely.");
        }
    }
}