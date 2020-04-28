package Replit_Solutions;

import java.util.Scanner;

/*
Given a String variable sentence, write code to type each word in separate lines.

Example:
sentence -> "Java is fun"
Print
Java
is
fun
 */
public class R106_Arrays_Split_Sentence_Loop_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        //WRITE YOUR CODE HERE
        String words[] = sentence.split(" ");
        String result = "";
        for (String eachwords : words) {
            result = eachwords;
            System.out.println(result);
        }
    }
}
