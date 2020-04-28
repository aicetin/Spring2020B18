package Replit_Solutions;
/*
Write a program that will output length of the text (string).
 */
import java.util.Scanner;
public class R058_Find_The_Length_String_Methods {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // WRITE YOUR CODE HERE
        System.out.println("Please enter the text:");
        String word = input.next();
        int word1 = word.length();
        System.out.println("Length is: "+word1);
    }
}
