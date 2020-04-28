package day17_WhileLoops;

import java.util.Scanner;

public class B05_Deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Yes or No");
        String word = input.next();

        boolean valid = word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no");
        while (!valid) {
            System.out.println("Please re entered");
            word = input.next();

            if (word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no")){
                break;
            }

        }
        if (word.equalsIgnoreCase("yes")) {
            System.out.println("Entered Yes");
        }
        if (word.equalsIgnoreCase("no")) {
            System.out.println("Entered No");
        }

    }
}
