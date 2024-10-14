package basicsOfJava;
import java.util.Scanner;


public class Input {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = sc.nextInt();
        System.out.println("enter the num2");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("the sum of number is");
        System.out.println(sum);
        sc.close();
    }
}
