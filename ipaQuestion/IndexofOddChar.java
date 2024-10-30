package ipaQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexofOddChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<Character> l1 = new ArrayList<>();
        for(int i =0;i<str.length();i++){
           if(i%2!=0){
            l1.add(str.charAt(i));
           }
        }
        for(int i =0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        sc.close();
    }
}
