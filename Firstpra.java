
import java.util.Scanner;
import java.util.Arrays;
class Course{
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    // constructor
    public Course(int courseId,String courseName ,String courseAdmin , int quiz,int handson){
    this.courseId = courseId;
    this.courseName = courseName;
    this.courseAdmin = courseAdmin;
    this.quiz = quiz;
    this.handson = handson;
    }
    // getter and setter
    public int getcourseId(){
        return courseId;
    }
    public void setcourseId(int courseId){
        this.courseId = courseId;
    }
    public String getcourseName(){
        return courseName;
    }
    public void setcourseName(String courseName){
        this.courseName = courseName;
    }
    public String getcourseAdmin(){
        return courseAdmin;
    }
    public void setcourseAdmin(String courseAdmin ){
        this.courseAdmin = courseAdmin;
    }
    public int getquiz(){
        return quiz;
    }
    public void setquiz(int quiz){
        this.quiz = quiz;
    }
    public int gethandson(){
        return handson;
    }
    public void sethandson(int handson){
        this.handson = handson;
    }
}

public class Firstpra {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Course[] courses = new Course[4];
        for(int i =0;i<4;i++){
            int courseId = sc.nextInt();
            sc.nextLine();
            String courseName = sc.nextLine();
            String courseAdmin = sc.nextLine();
            int quiz = sc.nextInt();
            sc.nextLine();
            int handson = sc.nextInt();
            sc.nextLine();
            courses[i] = new Course(courseId,courseName,courseAdmin,quiz,handson);
        }
        String courseAdminSearch = sc.nextLine();
        int handsonnum = sc.nextInt();
        sc.nextLine();
        // findAvgOfQuizByAdmin
        int ans = findAvgOfQuizByAdmin(courses,courseAdminSearch);
        System.out.println(ans);
        ///////////////  
        /// 
        Course[] sortedans =      sortCourseByHandsOn(courses,handsonnum);
        if(sortedans!=null){
            for(int i =0;i<sortedans.length;i++){
                System.out.println(sortedans[i].getcourseName());
            } 
        }
        else {
            System.out.println("no course ");
        }
    }
    public static int findAvgOfQuizByAdmin(Course[] courses,String adminsearch){
        int sumquiz =0;
        int cnt =0;
        for(int i =0;i<4;i++){
            if(courses[i].getcourseAdmin().equalsIgnoreCase(adminsearch)){
                sumquiz = courses[i].getquiz()+sumquiz;
                cnt++;
            }
        }
        int avg = sumquiz/cnt;
        if(avg>0) return avg;
        else return 0;
    }
    public static Course[] sortCourseByHandsOn(Course[] courses,int num){
     Course[] coursebyhand = new Course[4];
     int cnt =0;
     for(int i =0;i<4;i++){
        if(courses[i].gethandson()<num){
            coursebyhand[cnt++] = courses[i];
        }
     }
     if(cnt==0){
        return null;
     }
    for(int i =0;i<cnt-1;i++){
        for(int j =i+1;j<cnt;j++){
          if(coursebyhand[i].gethandson()>coursebyhand[j].gethandson()){
            Course temp = coursebyhand[i];
            coursebyhand[i] = coursebyhand[j];
            coursebyhand[j] = temp;
          }
        }
    }
    return Arrays.copyOf(coursebyhand, cnt);
  }
}
