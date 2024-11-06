import ipaQuestion.*;
import java.util.*;

class Course
{
	private int cid, quiz, handson;
	private String cname, cadmin;
	
	public Course(int cid, String cname, String cadmin, int quiz, int handson)
	{
		this.cid = cid;
		this.cname = cname;
		this.cadmin = cadmin;
		this.quiz = quiz;
		this.handson = handson;
	}
	
	public int getCid()
	{
		return cid;
	}
	public void setCid(int cid)
	{
		this.cid = cid;
	}
	public String getCname()
	{
		return cname;
	}
	public void setCname(String cname)
	{
		this.cname = cname;
	}
	public String getCadmin()
	{
		return cadmin;
	}
	public void setCadmin(String cadmin)
	{
		this.cadmin = cadmin;
	}
	public int getQuiz()
	{
		return quiz;
	}
	public void setQuiz(int quiz)
	{
		this.quiz = quiz;
	}
	public int getHandson()
	{
		return handson;
	}
	public void setHandson(int handson)
	{
		this.handson = handson;
	}
}
public class courseProgram {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Course[] course = new Course[4];
		for(int i=0; i<4; i++)
		{
			int a = sc.nextInt();sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt();sc.nextLine();
			int e = sc.nextInt();sc.nextLine();

			course[i] = new Course(a,b,c,d,e);	
		}
		String admin = sc.nextLine();
		int hand = sc.nextInt();
        
		findAvgOfQuizByAdmin(course,admin);
       Course[] ans = sortCourseByHandsOn(course,hand);
	}
	public static int findAvgOfQuizByAdmin(Course[] course , String admin){
		int sum=0, count=0;
		for(int i=0; i<course.length; i++)
		{
			if(course[i].getCadmin().equalsIgnoreCase(ad))
			{
				sum = sum+course[i].getQuiz();
				count++;
			}
		}
		if(count>0)
		{
			int avg = sum/count;
			return avg;
		}
		else
		{
			return 0;
		}
	}
}


sortCourseByHandsOn method:
This method will take an Array of Course Objects and int
value as input parameters.
This methods should return an Array of Course objects in an
ascending order of their  handson which are less than the
given handson(int parameter passed) value. if there is no
such course then the method should return null.