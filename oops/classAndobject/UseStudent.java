package oops.classAndobject;

public class UseStudent {
    public static void main(String[] args) {
        Student s ;
        s= new Student(); // Creating a new Student object
        s.roll = 10;
        s.name = "Deepanshu";
        s.per = 83.53;

        // Printing Student details
        System.out.println("Roll = " + s.roll);
        System.out.println("Name = " + s.name);
        System.out.println("Per = " + s.per);
    }
}
