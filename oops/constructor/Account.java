package oops.constructor;

public class Account {
    private int accId;
    private String name;
    private double balance;

    public Account(int id , String n, double bal){
        accId = id;
        name = n;
        balance = bal;
        System.out.println("constructor called .. ");
    }
    public void showAccount(){
        System.out.println("id="+accId);
        System.out.println("name="+name);
        System.out.println("balances="+balance);
    }
}
