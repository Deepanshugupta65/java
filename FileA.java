
import java.util.ArrayList;
import java.util.Scanner;

public class FileA {
    public static void main(String[] args) {
         ArrayList<Integer> l1 = new ArrayList<>();
        // same as for Float , Boolean
        // add element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        // get an elemnt ar index i
        System.out.println(l1.get(1)); // 6

        // by using for loop
        for(int i =0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        // print list by using directly
        System.out.println(l1);  // [5,6,7 ]

        // adding element at some index [5,50,6,7]
        l1.add(1,50);
        System.out.println(l1);
        System.out.println(l1.size());
        // modifying elemtn at index i
        l1.set(1,100);

        // remog elent at index
        l1.remove(1);
        System.out.println(l1);
        // remove an elemt e
        l1.remove(Integer.valueOf(6));
        System.out.println(l1);
Scanner sc = new Scanner(System.in);
        ArrayList<Integer> newarr = new ArrayList<>();
         for(int i =0;i<5;i++){
          newarr.add(sc.nextInt());
         }
         System.out.println(newarr);
    }
}
