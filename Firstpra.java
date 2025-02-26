import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
// import java.util.List;

class Course {
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    // Constructor
    public Course(int courseId, String courseName, String courseAdmin, int quiz, int handson) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    // Getters
    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseAdmin() {
        return courseAdmin;
    }

    public int getQuiz() {
        return quiz;
    }

    public int getHandson() {
        return handson;
    }
}

// Comparator to sort by "handson" in descending order
class SortByHandson implements Comparator<Course> {
    public int compare(Course a, Course b) {
        return b.getHandson() - a.getHandson(); // Descending order
    }
}

public class Firstpra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] courses = new Course[4];

        // Input for courses
        for (int i = 0; i < 4; i++) {
            int courseId = sc.nextInt();
            sc.nextLine(); // Consume newline
            String courseName = sc.nextLine();
            String courseAdmin = sc.nextLine();
            int quiz = sc.nextInt();
            sc.nextLine(); // Consume newline
            int handson = sc.nextInt();
            sc.nextLine(); // Consume newline
            courses[i] = new Course(courseId, courseName, courseAdmin, quiz, handson);
        }

        // Search input
        String courseAdminSearch = sc.nextLine();
        int handsonNum = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Find average of quizzes by admin
        int avgQuiz = findAvgOfQuizByAdmin(courses, courseAdminSearch);
        System.out.println(avgQuiz);

        // Find courses with hands-on exercises less than handsonNum and sort them
        ArrayList<Course> sortedCourses = sortCourseByHandsOn(courses, handsonNum);
        if (!sortedCourses.isEmpty()) {
            for (Course course : sortedCourses) {
                System.out.println(course.getCourseName());
            }
        } else {
            System.out.println("no course");
        }

        sc.close(); // Close scanner
    }

    public static int findAvgOfQuizByAdmin(Course[] courses, String adminSearch) {
        int sumQuiz = 0, count = 0;

        for (Course course : courses) {
            if (course.getCourseAdmin().equalsIgnoreCase(adminSearch)) {
                sumQuiz += course.getQuiz();
                count++;
            }
        }

        // Avoid division by zero
        return (count > 0) ? (sumQuiz / count) : 0;
    }

    public static ArrayList<Course> sortCourseByHandsOn(Course[] courses, int num) {
        ArrayList<Course> filteredCourses = new ArrayList<>();

        // Filter courses with handson < num
        for (Course course : courses) {
            if (course.getHandson() < num) {
                filteredCourses.add(course);
            }
        }

        // Sort in descending order of handson
        Collections.sort(filteredCourses, new SortByHandson());

        return filteredCourses;
    }
}
