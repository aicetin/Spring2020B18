package Replit_Solutions;
/*
Write a program that outputs the number of hours, minutes, and seconds that
corresponds to input total seconds.

-create a Scanner object
- declare int variables inputSeconds, hours, minutes, seconds
-Ask user enter seconds by printing:
"Enter seconds:"

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are
 in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result.

Example run:
Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
 */

import java.util.*;

public class R032_Seconds_Converter_Arthimetic_Operators {
    public static void main(String[] args) {
        //YOUR CODE HERE:
        Scanner input = new Scanner(System.in);
        System.out.println("Enter seconds:");

        int inputSeconds = input.nextInt();

        int seconds = inputSeconds % 60;
        int minutes = (inputSeconds / 60) % 60;
        int hours = (inputSeconds / 60 / 60) % 60;


        System.out.println(hours + " hours," + " " + minutes + " minutes" + " and " + seconds + " seconds");


    }

}
