package oops.methodoverloading;

public class UseAddition {

    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println("addition of int "+ obj.add(2, 2));
        System.out.println("addition 3 para int type "+ obj.add(12, 12, 12));
        System.out.println("double type "+ obj.add(12.2, 50.2));
        System.out.println("string concatinate "+ obj.add("deepanshu", "gupta"));
    }
}