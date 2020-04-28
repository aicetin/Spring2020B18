package Replit_Solutions;
/*
Write an expression using the conditional operator (? :) that compares the value of
the variable x to 5 and results in:
Display x if x is greater than or equal to 5
Display -x if x is less than 5
DO NOT USE IF STATEMENT or SWITCH CASE
 */
import java.util.Scanner;
public class R052_Ternary_Operator1_Ternary {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();
        //WRITE YOUR CODE HERE
        String expression = (x>=5) ? x+" is greater than or equal to "+ 5 : x+" is less than "+5;
        System.out.println(expression);
    }
}
