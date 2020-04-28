package Replit_Solutions;
/*
Write a program that will print out first and last letters together.
 */
import java.util.Scanner;
public class R062_Print_first_and_last_letters_String_Methods {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = scan.next();
        //WRITE YOUR CODE HERE
        int a = word.length()-1;
        String word1= word.substring(0,1);
        String word2= word.substring(a);
        System.out.println(word1+word2);


    }
}
