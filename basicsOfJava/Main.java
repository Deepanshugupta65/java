package basicsOfJava;

import java.util.Scanner;

class Algebra {
    int sum(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("Sum of numbers: " + obj.sum(a, b));
        sc.close();
    }
}
