package array;

import java.util.Scanner;

public class SecMinMax {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the data of array");
        for(int i =0;i<size;i++){
            arr[i] =  sc.nextInt();
        }
        int min = arr[0];
        for(int i = 1;i<size;i++){
            if(min >arr[i]){
                min = arr[i];
            }
        }
        System.out.println("minimum element of array "+min);
        int secmin = Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            if(min<arr[i]&&secmin>arr[i])
            secmin = arr[i];
        }
        System.out.println("sec min "+secmin);
        
        int maxi = arr[0];
        for(int i =1;i<size;i++){
            if(arr[i]>maxi)
            maxi = arr[i];
        }
        System.out.println("maximum element "+maxi);
        int seclargest = -1;
        for(int i =0;i<size;i++){
            if(seclargest<arr[i]&& arr[i] != maxi)
            seclargest = arr[i];
        }
        System.out.println("second maximum element " + seclargest);
        sc.close();
    }
}
