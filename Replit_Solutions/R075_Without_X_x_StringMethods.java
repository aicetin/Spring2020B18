package Replit_Solutions;

import java.util.Scanner;

/*
    Given a string word, if the first or last chars are 'x' or 'X', print the string
    without those 'x' or 'X' chars,  otherwise print the string unchanged.
 */
public class R075_Without_X_x_StringMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = scan.next();
        word= word.replace("x","").replace("X","");

            System.out.println(word);
        }
    }
