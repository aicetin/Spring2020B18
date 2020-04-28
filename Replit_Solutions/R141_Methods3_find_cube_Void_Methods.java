package Replit_Solutions;
/*
Given method called cube. Write all required code inside this method in order  to asks the user
 for a number and then prints the cubed value of that number:
Example:
input: 5
output: 125

hint: cube of a number n = n*n*n
 */

import java.util.Scanner;

public class R141_Methods3_find_cube_Void_Methods {
    public static void cube() {
        //your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = input.nextInt();
        System.out.println(a+"'s cub is "+a*a*a);


    }//end cube

    public static void main(String[] args) {

        cube();
    }
}
