package day17_WhileLoops;

import java.util.Scanner;

public class B07_Deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter user name");
        String userName = input.next();

        System.out.println("Enter pass Word");
        String passWord = input.next();

        boolean valid = userName.equals("cybertek") && passWord.equals("cybertek123");
        int count = 1;

        while (!valid) {
            System.out.println("Please re enter your credentions");
            System.out.println("Enter user name");
            userName = input.next();

            System.out.println("Enter pass Word");
            passWord = input.next();

            valid = (userName.equals("cybertek") && passWord.equals("cybertek123"));
            count++;

            if (count == 3 && !valid) {
                System.out.println("Your account is locked");
                break;
            }

        }
        if (valid) {
            System.out.println("Logged in");
        }
    }
}
