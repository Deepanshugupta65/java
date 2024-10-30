package ipaQuestion;

import java.util.Scanner;

public class FirstletterofWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");

        for(int i =0;i<words.length;i++){
            char ch = words[i].charAt(0);
            System.out.println(ch);
        }
        sc.close();
    }
}
