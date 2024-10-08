package oops.statickeyword;

class Data{
    static{
        System.out.println("static called...");
    }
    public Data(){
        System.out.println("constructor called...");
    }
    public static void show(){
        System.out.println("show called.....");
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        Data.show();
        // Data d1 = new Data();
        // Data d2 = new Data();

    }
}
