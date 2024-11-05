package basicsOfJava;

import java.util.Scanner;

public class Sortthe{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("enter the array data");
        for(int i =0;i<5;i++){
            arr[i] =  sc.nextInt();
        }
        int arr2[] = sortthearray(arr,5);
        for(int i =0;i<5;i++){
            // System.out.println(arr2[i]);
            if(arr2[i]==2){
         System.out.println(arr2[i]);
            }
        }
    }
    public static int[] sortthearray(int arr[], int n){
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(arr[i]>arr[j]){
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
            }
        }
        return arr;
    }
}