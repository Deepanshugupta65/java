package ipaQuestion;

import java.util.Scanner;

public class RemoveCh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        String gtr ="";
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                gtr = gtr + str.charAt(i);
            }
        }
       System.out.println(gtr);
       sc.close();
    }
   
}
