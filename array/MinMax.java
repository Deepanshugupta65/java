package array;

import java.util.Scanner;

public class MinMax {
    public int maximumNum(int arr[]){
       int largest = arr[0];
       for(int i =0;i<arr.length;i++){
        if(largest<arr[i])
        largest = arr[i];
       }
       return largest;
    }
    public static void main(String[] args) {
        System.out.println("enter size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the data of array");
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        MinMax m = new MinMax();
        System.out.println("max"+m.maximumNum(arr));
        sc.close();
    }
}
