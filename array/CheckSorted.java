package array;

import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int arr[] = new int[5];
        for(int i =0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        int s = checksorted(arr,5);
        if(s==1){
            System.out.println("sorted");
        }
        else{
            System.out.println("not sorted");
        }
        sc.close();
    }
    public static int checksorted(int arr[],int size){
       for(int i =0;i<size-1;i++){
        if(arr[i]<arr[i+1])
           continue;
        else{
            return 0;
        }
       }
       return 1;

    }
}
