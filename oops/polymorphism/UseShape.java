package oops.polymorphism;

public class UseShape {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area(10);
        s.area(10.22);
        s.area(10, 20);
    }
}
