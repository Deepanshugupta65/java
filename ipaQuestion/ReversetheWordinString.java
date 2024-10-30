package ipaQuestion;

import java.util.Scanner;

public class ReversetheWordinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // Split the string into words
        String[] words = str.split(" ");
        // Print the words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

        sc.close();
    }
}
