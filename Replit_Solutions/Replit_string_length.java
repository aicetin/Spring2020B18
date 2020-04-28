package Replit_Solutions;
/*
ask the user for his name, capture it on a string using scanner.
then output the length of the name string.
 */
import java.util.Scanner;
public class Replit_string_length {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String word= input.next();
        // WRITE YOUR CODE HERE
        int word1=word.length();
        System.out.println(word1);
    }

}
