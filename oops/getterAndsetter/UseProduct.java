package oops.getterAndsetter;

public class UseProduct {
    public static void main(String[] args) {
        Product p = new Product();
        p.setId(101);
        p.setName("magie");
        p.setPrice(35.2);
        System.out.println("getid"+p.getid());
        System.out.println("price"+p.getPrice());
        System.out.println("name"+p.getName());
    }
}
  