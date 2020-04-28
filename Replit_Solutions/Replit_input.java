package Replit_Solutions;
/*
write a program that asks the user for his first name and last name.
use a scanner to get the use input.
 */
import java.util.Scanner;
public class Replit_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();
        System.out.println("Your full name is: "+firstName+" "+lastName);
    }
}
