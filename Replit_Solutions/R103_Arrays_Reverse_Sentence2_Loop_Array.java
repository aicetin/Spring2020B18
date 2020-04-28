package Replit_Solutions;
/*
Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

Example:
sentence -> "Java is fun"
reversed -> "fun is Java"
 */
import java.util.*;
public class R103_Arrays_Reverse_Sentence2_Loop_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here
        String rev []=sentence.split(" ");
        for(int i=rev.length-1; i>=0; i--){
            reversed+=rev[i]+" ";
        }
        reversed=reversed.substring(0, reversed.length()-1);

        //End your code here. do not modify below statement
        System.out.println(reversed);

    }
}
