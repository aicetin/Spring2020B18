package Replit_Solutions;
/*
Given a String array words, iterate through each word and print first and last letter of each element
 in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne
 */
import java.util.*;
public class Arrays_print_first_last_char {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words");
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        //TODO: Write your code below

        for (String eachWord:words){
            eachWord=eachWord.charAt(0)+""+eachWord.charAt(eachWord.length()-1);
            System.out.println(eachWord);
        }
    }
}
