package ipaQuestion;
import java.util.*;
class Employee{
    private int employeeld;
    private String name;
    private String branch;
    private double rating;
    private boolean companyTransport;

    // constructor
    public Employee(int employeeld,String name,String branch,double rating,boolean companyTransport){
        this.employeeld =employeeld;
        this.name =name;
        this.branch = branch;
        this.rating = rating;
        this.companyTransport = companyTransport;
    }
    // getter 
    public int getemployeeld(){
        return employeeld; 
    }
    public String getname(){
        return name;
    }
    public String getbranch(){
        return branch;
    }
    public double getrating(){
        return rating;
    }
    public boolean getcompanyTransport(){
        return companyTransport;
    }
}
class Sorted implements Comparator<Employee>{
    public int compare(Employee a ,Employee b){
        return Double.compare(b.getrating(), a.getrating());
    }
}
public class Ipaten {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee[] arr = new Employee[4];
        for(int i =0;i<4;i++){
            int employeeld = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String branch = sc.nextLine();
            double rating = sc.nextDouble();
            boolean companyTransport = sc.nextBoolean();
            sc.nextLine();
            arr[i] = new Employee(employeeld,name,branch,rating,companyTransport);
        }
        String searchbranch = sc.nextLine();
        sc.close();
       int ans =  findCountOfEmployeesUsingCompTransport(arr,searchbranch);
        System.out.println(ans);

       Employee ans2 = findEmployeeWithSecondHighestRating(arr);
       if(ans2!=null){
        System.out.println(ans2.getemployeeld());
        System.out.println(ans2.getname());
       }
       else {
        System.out.println("all are using transport");
       }

    }
    public static int findCountOfEmployeesUsingCompTransport(Employee[]arr,String branch){
        int cnt =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i].getcompanyTransport()&&arr[i].getbranch().equalsIgnoreCase(branch)){
                cnt++;
            }
        }
        return cnt > 0?cnt :0;
    }
    public static Employee findEmployeeWithSecondHighestRating(Employee[] arr){
        List<Employee> newArr = new ArrayList<>();
        for(int i =0;i<4;i++){
           if(arr[i].getcompanyTransport()==false){
            newArr.add(arr[i]);
           }
           
        }
        if(newArr.size()<2) return null;
        Collections.sort(newArr,new Sorted());
        Employee temp = newArr.get(1);
        return temp ;
       
    } 
}
