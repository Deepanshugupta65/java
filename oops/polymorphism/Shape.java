package oops.polymorphism;

public class Shape {
    public void area(double radius){
        double area = Math.PI*Math.pow(radius, 2);
        System.out.println("area of circle"+area);
    }
    public void area(int side){
        int area = side *side;
        System.out.println("area of square"+area);
    }
    public void area(int len , int breadth){
        int area = len *breadth;
        System.out.println("area of reactangle"+area);
    }
}
