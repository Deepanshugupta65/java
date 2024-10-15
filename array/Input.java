package array;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter data of array");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("output of array");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("for each method of array");
        for(int data:arr){
            System.out.print(data+" ");
        }
        sc.close();
    }
}
