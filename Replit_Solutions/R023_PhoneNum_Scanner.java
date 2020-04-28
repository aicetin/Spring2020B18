package Replit_Solutions;

import java.util.Scanner;

/*
Write a program that asks user to input int values: areaCode and localNumber.

-Using concatenation put together in this format and assign to String phoneNumber  variable:

-(222)-3334444

-Write a print statement that displays (use phoneNumber variable ):
Calling number (222)-3334444
 */
public class R023_PhoneNum_Scanner {
    public static void main(String[] args) {
        //YOUR CODE HERE
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Area Code: ");
        int areaCode = input.nextInt();
        System.out.println("Enter your Local Number: ");
        int localNumber = input.nextInt();
        String phoneNumber ="Calling number" +"("+areaCode+")-"+localNumber;
        System.out.println(phoneNumber);

    }
}
