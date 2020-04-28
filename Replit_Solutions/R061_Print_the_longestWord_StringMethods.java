package Replit_Solutions;

import java.util.Scanner;

/*
Write a program that will print out the longest word between two words.
 */
public class R061_Print_the_longestWord_StringMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word");
        String word1 = scan.next();
        System.out.println("Enter your second word");
        String word2 = scan.next();
        //WRITE YOUR CODE HERE
        if (word1.length() > word2.length()) {
            System.out.println(word1);
        } else {
            System.out.println(word2);
        }
    }
}
