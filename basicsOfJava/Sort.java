package basicsOfJava;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>();
        for(int i =0;i<5;i++){
            int number = sc.nextInt();
            l1.add(number);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans = sortthecode(l1); 
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    sc.close();

    }
    public static ArrayList<Integer> sortthecode(ArrayList<Integer> list){

     Collections.sort(list,Collections.reverseOrder());
     return list;
    }
}
