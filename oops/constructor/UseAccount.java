package oops.constructor;

public class UseAccount {
    public static void main(String[] args) {
        Account obj =new Account(101,"deep",4000.00);
        obj.showAccount();
        Account obj2 = new Account(10,"slkfmkl",20.36);
        obj2.showAccount();
    }
}
