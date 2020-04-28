package Replit_Solutions;
import java.util.Scanner;
/*
        Write a program that will print out last letter of the word (string).
         */

public class R060_Last_Character {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = scan.next();
        int maxIndexNum = word.length() - 1;
        char lastCharacter = word.charAt(maxIndexNum);
        System.out.println(lastCharacter);
    }
}

