public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("S001", "Aaron", "aaron@email.com");
        Professor p1 = new Professor("P001", "Dr. Lynn", "lynn@email.com");
        AdminStaff a1 = new AdminStaff("A001", "Faith", "faith@email.com");
        ConcreteCourse c1 = new ConcreteCourse("CS101", "Intro to CS");

        Department dept = new Department("Cyber Security");
        dept.addStudent(s1);
        dept.addProfessor(p1);
        dept.addCourse(c1);

        s1.registerCourse(c1);
        p1.assignGrade(s1, c1, 85.0);

        s1.displayDetails();
        p1.displayDetails();
        a1.displayDetails();
        c1.getCourseInfo();
        dept.displayDepartmentInfo();
    }
}