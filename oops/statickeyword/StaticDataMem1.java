package oops.statickeyword;

class Emp{
    private int age;
    private String name;
    private static String comp = "Amazon";

    public Emp(int a,String n){
        age = a;
        name = n;
    }
    public void display(){
        System.out.println("age="+age+"name="+name+"comp="+comp);
    }
}


public class StaticDataMem1 {
    public static void main(String[] args) {
        Emp e = new Emp(10, "deep");
        Emp f = new Emp(20, "revae");
        Emp g = new Emp(30, "reav");
        e.display();
        f.display();
        g.display();
    }
}
