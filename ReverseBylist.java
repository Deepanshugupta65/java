import java.util.ArrayList;
import java.util.Collections;
public class ReverseBylist {
    // static void reverse(ArrayList<Integer>list){
    //   Collections.reverse(list)
    // }

    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
        //  reverse(list); 
        // inbuilt
        Collections.reverse(list);
         System.out.println(list);
        //  sort
        Collections.sort(list);
        // assendoign order
        System.out.println(list);
        // in decending
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
