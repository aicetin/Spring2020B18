package Replit_Solutions;

import java.util.*;

/*
In this problem you need to write a program that checks for the bigger of 3 numbers.

You are given 3 int variables: num1 , num2 and num3.

if num1 is biggest - output: "n1 is bigger"
if num2 is biggest - output: "n2 is bigger"
if num3 is biggest - output: "n3 is bigger"
 */
public class Assismenttest_Print_largestnumber_among_three_numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = s.nextInt();
        System.out.println("Enter num2");
        int num2 = s.nextInt();
        System.out.println("Enter num3");
        int num3 = s.nextInt();
        //your code here
        if (num1 > num2 && num1 > num3 ) {
            System.out.println("n1 is bigger");
        }
        if (num2 > num3 && num2 > num1 ) {
            System.out.println("n2 is bigger");
        }
        if (num3 > num2 && num3 > num1) {
            System.out.println("n3 is bigger");
        }
    }
}