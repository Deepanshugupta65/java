package oops.encapsulation;

public class UseStudent {
    public static void main(String[] args) {
        Student s ;
        s= new Student(); // Creating a new Student object
        s.setStudent(10, "amit", 80.2);
        s.showStudent();
    }
}
