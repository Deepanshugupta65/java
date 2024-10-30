package ipaQuestion;

import java.util.Scanner;
public class NumberofLowercase {
  public static void main(String [] argas){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int number = lowercase(s);
    System.out.println(number);
    sc.close();
  }
  public static int lowercase(String s){
    int cnt =0;
      for(int i =0;i<s.length();i++){
        if(s.charAt(i)>='a' && s.charAt(i)<='z')
        cnt++;
      }
      return cnt;
  }    
}
