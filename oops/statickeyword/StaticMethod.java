package oops.statickeyword;


class Mymath{
    public static int add(int a,int b){
        return a+b;
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        System.out.println("sum of 10 and 20"+Mymath.add(10,20));
    }
}
// when the function work on the basis of paramerter  