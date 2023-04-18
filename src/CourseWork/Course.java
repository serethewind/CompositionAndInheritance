package CourseWork;

public class Course {
    private String courseTitle;
    private CourseWork courseWorkMark;

    public Course(String courseTitle, CourseWork courseWorkMark) {
        this.courseTitle = courseTitle;
        this.courseWorkMark = courseWorkMark;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public CourseWork getCourseWorkMark() {
        return courseWorkMark;
    }

    public void setCourseWorkMark(CourseWork courseWorkMark) {
        this.courseWorkMark = courseWorkMark;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseTitle='" + getCourseTitle() + '\'' +
                ", courseWorkMark=" + getCourseWorkMark().toString() +
                '}';
    }
}
