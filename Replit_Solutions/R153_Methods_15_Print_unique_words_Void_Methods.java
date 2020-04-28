package Replit_Solutions;
/*
Complete a void method printUniqueWords() that will print only unique words from an array of strings.
 Every single unique word should be printed from the new line.

Example:
input:[java, code, python, code, rust, code, rust]
output:
java
python
 */

import java.util.*;

public class R153_Methods_15_Print_unique_words_Void_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words) {
        //WRITE YOUR CODE HERE

        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(words[i]);
            }

        }
        /*
        for (String each2:words){
            int count=0;
            for (String each:words){
                if (each2.equals(each)){
                    count++;
                }
            }
            if (count==1){
                System.out.println(each2);
            }
        }

         */
    }
}