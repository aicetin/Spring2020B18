package day22_Arrays_Loops;

import java.util.Scanner;
import java.util.Arrays;
public class A02_Scanner_Arrays_WUT {
    /*
     Task02:
1. Write a program that will take five Strings and save them into an array called arr.
2. use for each loop to print out the first three letter of each element of arr,
one per line. You can assume that every element of arr is at least 3 letters long.
            Example:
                arr -> ["apple", "banana"]
                prints: app
                        ban
           Arrays, scanner, for loop, for each loop, substring
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String arr[] = new String[5];

        for(int i = 0; i < arr.length ; i++){
            arr[i] = input.next();
        }

        System.out.println(Arrays.toString(arr) );

        for( String each  : arr  ){

            // String str = each.substring(0, 2+1);  // for first three characters
            String str = each.charAt(0) + "" +  each.charAt(each.length()-1);  // for first and last character
            System.out.println(str);
        }



    }


}