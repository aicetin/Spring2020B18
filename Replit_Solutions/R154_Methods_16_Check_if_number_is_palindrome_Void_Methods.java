package Replit_Solutions;
/*
Complete a method isPalindrome() that will check if number is a palindrome.
Print your result as a boolean (true or false).
Example:
input: 1001
output: true

Example:
input: 1234
output: false
 */

import java.util.*;

public class R154_Methods_16_Check_if_number_is_palindrome_Void_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num) {
        //WRITE YOUR CODE HERE
        /*
        String text = "" + num; //  int converted to String
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        boolean result = (text.equals(reversed)) ? true : false;
        System.out.println(result);

         */

        String str =""+num;
        int count = 0;
        for(int i= 0; i<str.length(); i++){
            if(str.charAt(i)==str.charAt((str.length()-1)-i)){
                count++;}
        }
        boolean result =(str.length()/2<=count);
        System.out.println(result);
        //i==0, str.charAt(0)    str.charAt(str.length()-1-0)
        //i==1, str.charAt(1)    str.charAt(str.length()-1-1)
        //i==2,  str.charAt(2)    str.charAt(str.length()-1-2)
        //i==3,  str.charAt(3)    str.charAt(str.length()-1-3)
    }


}
