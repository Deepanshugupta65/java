package arraytwo;

import java.util.ArrayList;

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
        System.out.println(l1);
    }
}
