package Replit_Solutions;
/*
Given the array words, it will print the word with the largest length.
Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 */
import java.util.*;
public class R115_Arrays_FindingMaxLength_in_String_array_Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        //write your code below
        int max= words[0].length();
        String longest = words[0];

        for(int i = 0; i< 5; i++){
            if(words[i].length()>max){
                max=words[i].length();
                longest=words[i];
            }
        }
        System.out.println(longest);
    }
}
