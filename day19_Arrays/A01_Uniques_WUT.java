package day19_Arrays;
/*
1. write a program that can return the unique characters from a string
		Ex:  "AABCC" ==> "B"
 */

import java.util.Scanner;

public class A01_Uniques_WUT {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = input.next();

        String result = ""; //"C", to store the unique characters


        for(int j=0; j <= str.length()-1; j++ ){
            char ch2 = str.charAt(j);
            int count = 0 ;  // to count the occurence of the character

            for(int i = 0; i <= str.length()-1; i++){
                char ch = str.charAt(i);
                if(ch == ch2){  // check how many time the character is  occured in the string
                    count++;
                }
            }

            if(count == 1){  // if the character at index J is unique , will be concated to the result
                result+=ch2;
            }

        }


        System.out.println(result);














    }



}