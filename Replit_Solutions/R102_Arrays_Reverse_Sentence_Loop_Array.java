package Replit_Solutions;
/*
Given a String variable sentence, write code to type each word in separate lines in a reverse order.
Example:
sentence -> "Java is fun"
Print
fun
is
Java
 */
import java.util.*;
public class R102_Arrays_Reverse_Sentence_Loop_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: Type your code below
        String reverse[] = sentence.split(" ");
        String result = "";
        for(int i = reverse.length-1; i>= 0; i--){
            result = reverse[i];
            System.out.println(result);
        }
    }
}
