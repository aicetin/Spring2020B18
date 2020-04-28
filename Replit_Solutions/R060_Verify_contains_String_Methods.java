package Replit_Solutions;
/*
Write a program that will verify if word contains in the sentence.
Print out the result as boolean value.
 */
import java.util.Scanner;

public class R060_Verify_contains_String_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = scan.nextLine();
        System.out.println("Enter your sentence");
        String sentence = scan.nextLine();
        //WRITE YOUR CODE HERE
        boolean verifyWord = sentence.contains(word);
        System.out.println(verifyWord);

    }
}