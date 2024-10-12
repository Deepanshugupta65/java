package oops.polymorphism.runtime;

public class LangUse {
    public static void main(String[] args) {
        Language lng;
        lng = new Hindi();
        lng.greetings();

        lng = new English();
        lng.greetings();

        lng = new French();
        lng.greetings();
    }
}
