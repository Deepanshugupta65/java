package array;

import java.util.Scanner;
import java.util.ArrayList;
public class Concatiante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i =0;i<5;i++){
            arr[i]= sc.nextInt();
        }
         concatinate(arr,5);
         sc.close();
    }
    public static void concatinate(int arr[], int size){
        ArrayList<Integer> l1 = new ArrayList<>();
        for(int i =0;i<2*size;i++){
            l1.add(arr[i%size]);
        }
        for(int i =0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
    }
}
