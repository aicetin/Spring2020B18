package Replit_Solutions;
/*
Write a program that will look up for user.
Assume that you have only 2 users: Max Payne and Alan Wake.  First, ask user to enter full name.
Display message: "Enter full name:". Then take input from user. If name is equals to either "Max Payne"
 or "Alan Wake",  display message: "User found!". Otherwise,  display message: "User not found!".
 Please make your search case insensitive!
 */
import java.util.Scanner;
public class R057_Find_a_user_String_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");
        String fullName = scan.nextLine();
        String name1="Max Payne";
        String name2="Alan Wake";
        boolean validName1=name1.equalsIgnoreCase(fullName);
        boolean validName2=name2.equalsIgnoreCase(fullName);
        if(validName1||validName2){
            System.out.println("User found!");
        }else {
            System.out.println("User not found!");
        }

    }

}
