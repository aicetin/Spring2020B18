package Replit_Solutions;
/*
Return the number of times that the string "java" appears anywhere in the given string word.
Example:
input: javaxjava
output: 2

Example:
input: javaxjavaapplepearjavaegg
output: 3
 */
import java.util.Scanner;
public class R090_Count_Java_Loop_String {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        word = word.toLowerCase();
        int countjava = 0;
        while (word.contains("java")) {
            word = word.replaceFirst("java", "");
            countjava++;

        }
        System.out.println(countjava);
    }
}
