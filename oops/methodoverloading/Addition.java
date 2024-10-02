package oops.methodoverloading;

public class Addition {
    public int add(int i , int j){
        int c = i +j;
        return c;
    }
    public int add(int i , int j,int k){
        int c = i +j+k;
        return c;
    }
    public double add(double i ,double j){
        double k = i +j;
        return k;
    }
    public String add(String i ,String j){
        String k = i + j;
        return k;
    }
}
