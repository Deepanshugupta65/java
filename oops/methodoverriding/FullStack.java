package oops.methodoverriding;

public class FullStack extends FrontendDev {
    public void mySkill(){
        // it will go parent class and call myclass 
        super.mySkill();
        System.out.println("i know node ,express , mongo db");
    }
}
