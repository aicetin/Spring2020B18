package Replit_Solutions;
/*
Automated tests are the future.
in the given program you have a quiz question and a scanner to catch user input which will be stored on string a.

after the user inputs an answer (a, b or c) we need to check if its the correct, wrong, valid answer.
 */
import java.util.*;
public class R040_Quiz_Question_Multi_Branch_If {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:");
        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune");

        System.out.println("Enter your answer");
        String answer = s.nextLine();
        //your code here

        System.out.println("Answer is: "+answer);
        System.out.println(answer +" is wrong");





    }
    }
