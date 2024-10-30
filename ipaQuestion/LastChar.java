package ipaQuestion;

import java.util.Scanner;

public class LastChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] words = str.split(" ");
        for(int i =0;i<words.length;i++){
            int size = words[i].length()-1;
            char ch = words[i].charAt(size);
            System.out.println(ch);
        }
        sc.close();
    }
}
