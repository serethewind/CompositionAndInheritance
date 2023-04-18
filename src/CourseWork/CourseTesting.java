package CourseWork;

public class CourseTesting {
    public static void main(String[] args) {
        CourseWork javaMarks = new CourseWork(20, 20, 50);
        Course java = new Course("Java", javaMarks);
        System.out.println(java);
    }
}
