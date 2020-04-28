package day18_NestedLoop;

import java.util.Scanner;

public class B09_Deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            System.out.println("Addition of two numbers is: " + (num1 + num2));
            System.out.println("Do you want to continue");
            String answer = input.next();
                while ( ! (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                    System.out.println("Invalid entry, please enter yes or no");
                    answer = input.next();
                }

            if(answer.equalsIgnoreCase("No")){
                System.out.println("Thank you for using calculator");
                break;
            }
        }

    }
}
