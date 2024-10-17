package ipaQuestion;

import java.util.Scanner;

public class VowelsInSent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine().trim();
        
        if (s.isEmpty()) {
            System.out.println("String is empty");
            sc.close();
            return;
        }

        String[] words = s.split("\\s+");  // Handle multiple spaces
        int cnt = 0;

        for (String word : words) {
            char ch = Character.toLowerCase(word.charAt(0));  // Convert to lowercase for simpler checking
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                cnt++;
            }
        }

        if (cnt > 0) {
            System.out.println(cnt);
        } else {
            System.out.println("not found");
        }

        sc.close();
    }
}
