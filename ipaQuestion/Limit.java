package ipaQuestion;
import java.util.Scanner;

public class Limit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter the data in array");
        for(int i =0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        int limit1 = sc.nextInt();
        int limit2 = sc.nextInt();
        int sum =0;
        int cnt =0;
        for(int i =0;i<5;i++){
        if(limit1<arr[i]&&arr[i]<limit2){
            sum = sum + arr[i];
            cnt++;
        }
        }
        System.out.println("sum"+sum+"cnt"+cnt);
        int average = (cnt>0)? sum/cnt : 0;
        System.out.println(average);
        sc.close();
    }
}