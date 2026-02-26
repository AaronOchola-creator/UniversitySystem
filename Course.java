public abstract class Course {
    protected String courseCode;
    protected String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public abstract void getCourseInfo();
}
