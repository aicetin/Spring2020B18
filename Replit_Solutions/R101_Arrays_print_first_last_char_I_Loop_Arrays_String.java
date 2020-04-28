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
public class R101_Arrays_print_first_last_char_I_Loop_Arrays_String {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};


        //TODO: Write your code below

        /*
        first solution :
        for( String eachWord : words){
            System.out.println(eachWord.substring(0,1)+eachWord.substring(eachWord.length()-1));
        }
        second solution :
        for( String eachWord : words){
            String firstLetter = eachWord.substring(0,1);
            String lastLetter = eachWord.substring(eachWord.length()-1);

            System.out.println(firstLetter+lastLetter);

        }
            third solution :
         */
        for(int i = 0; i <= words.length-1; i++){
            System.out.println(words[i].charAt(0)+" "+words[i].charAt(words.length-1));

        }

    }
}
