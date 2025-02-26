// package pra;
// create the class Course with the below Attributes.

// courseId- int
// courseName- String
// courseAdmin- String
// quiz- int
// handson -int

// The above methods should be private ,write getter and
// setter and parametrized constructor as required.

// create class courseProgram with main method.

// implement two static methods-
//    findAvgOfQuizByAdmin method:this method will take array
// of Course objects and a String  value as input parameters.
// This method will find out Average (as int) of Quiz questions
// for given Course Admin (String parametre passed)
// This method will return Average if found.if there is no course
// that matches then the method should return 0.

// sortCourseByHandsOn method:
// This method will take an Array of Course Objects and int
// value as input parameters.
// This methods should return an Array of Course objects in an
// ascending order of their  handson which are less than the
// given handson(int parameter passed) value. if there is no
// such course then the method should return null.

// The above mentioned static methods should be called from
// main methods.

// for findAvgOfQuizByAdmin method: The main method
// should print the average if the returned value is not 0.
// if the returned value is 0 then it should print "No Course
// found."


// for sortCourseByHandsOn method:
//                         the  main method should print the name
// of the Course from the returned Course object Array if the
// returned value is not null.if the returned value is null then
// it should print "No Course found with mentioned attribute."

// input1:
// 111
// kubernetes
// Nisha
// 40
// 10
// 321
// cassandra
// Roshini
// 30
// 15
// 457
// Apache Spark
// Nisha
// 30
// 12
// 987
// site core
// Tirth
// 50
// 20
// Nisha
// 17

// output1:
// 35
// kubernetes
// Apache Spark
// cassandra

// input2:
// 111
// kubernetes
// Nisha
// 40
// 10
// 321
// cassandra
// Roshini
// 30
// 15
// 457
// Apache Spark
// Nisha
// 30
// 12
// 987
// site core
// Tirth
// 50
// 20
// Shubhamk
// 5

// output 2:
// No Course found
// No Course found with mentioned attributes.


import java.util.*;
class Course{
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

// sort implement 
class sortbyhand implements Comparator<Course>{
	public int compare(Course a ,Course b) {
		return a.getHandson() - b.getHandson();
	}
}
public class PraSecond {
  public static void main(String [] args) {
	  Scanner sc = new Scanner(System.in);
	    Course[] courses = new Course[4];
//	    input value 
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
	    String courseAdminSearch = sc.nextLine();
        int handsonNum = sc.nextInt();
        sc.nextLine(); // Consume newline
        sc.close();
        int avgans =findAvgOfQuizByAdmin(courses,courseAdminSearch);
        if(avgans>0) {
            System.out.println(avgans);

        }
        else {
        	System.out.println("No course found");
        }
        
        ArrayList<Course> ans2 =sortCourseByHandsOn(courses,handsonNum);
        if(ans2!=null) {
        	for(int i =0;i<ans2.size();i++) {
        		System.out.println(ans2.get(i).getCourseName());
        	}
        }
        else {
        	 System.out.println("No Course found with mentioned attribute.");
        }
        
    }
  public static int findAvgOfQuizByAdmin(Course[] courses,String courseAdminSearch) {
	  int sum =0;
	  int cnt =0;
	  for(int i =0;i<4;i++) {
		  if(courses[i].getCourseAdmin().equalsIgnoreCase(courseAdminSearch)) {
			  sum = sum + courses[i].getQuiz();
			  cnt++;
		  }
	  }
	  return cnt>0 ? sum / cnt : 0;
  }
  public static ArrayList<Course> sortCourseByHandsOn(Course[] courses,int handson){
	  ArrayList<Course> filtercourse = new ArrayList<>();
	  for(int i =0;i<4;i++) {
		  if(courses[i].getHandson()<handson) {
			  filtercourse.add(courses[i]);
		  }
	  }
	  if(filtercourse.isEmpty()) {
		  return null;
	  }
	  Collections.sort(filtercourse,new sortbyhand());
	//   return filtercourse.toArray(new Course[0]);
    return filtercourse;

  }
}
