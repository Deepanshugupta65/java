package ipaQuestion;

import java.util.Scanner;

public class Removeduplicate {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str = sc.nextLine();
        String gtr = "";
       for(int i =0;i<str.length()-1;i++){
        for(int j =1;j<str.length();j++){
            if(str.charAt(i)!=str.charAt(j)){
                gtr = gtr + str;
            }
            else{
                
            }
        }
       }
    }
}
 