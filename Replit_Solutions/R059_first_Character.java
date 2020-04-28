package Replit_Solutions;
import java.util.Scanner;
/*
Write a program that will print out first character of the word.
 */
public class R059_first_Character {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = scan.next();
        // WRITE HERE YOUR CODE

        char firstLetter = word.charAt(0);
        System.out.println(firstLetter);
    }
}
