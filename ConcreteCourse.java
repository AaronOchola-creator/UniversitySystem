public class ConcreteCourse extends Course {
    public ConcreteCourse(String courseCode, String courseName) {
        super(courseCode, courseName);
    }

    @Override
    public void getCourseInfo() {
        System.out.println("Course: " + courseCode + " - " + courseName);
    }
}