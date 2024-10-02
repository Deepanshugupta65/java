package oops.getterAndsetter;

public class Product {
    private int id;
    private String name;
    private double price;

    public void setId(int i){
        id = i;
    }
    public void setPrice(double d){
       price =d;
    }
    public void setName(String s){
        name = s;
    }
     public int getid(){
        return id;
     }
     public String getName(){
        return name;
     }
     public double getPrice(){
        return price;
     }
}
