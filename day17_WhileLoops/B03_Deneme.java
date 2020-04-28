package day17_WhileLoops;

import java.util.Scanner;

public class B03_Deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int i = 0; i == 0;){


        System.out.println("Enter first number");
        int num1 = input.nextInt();

        System.out.println("Enter second number");
        int num2 = input.nextInt();

        System.out.println("Enter math operator");
        String operator = input.next();

            if (operator.equals("+")) {
                System.out.println("Addition is: " + (num1 + num2));
            } else if (operator.equals("-")) {
                System.out.println("Subraction is: " + (num1 - num2));
            } else if (operator.equals("*")) {
                System.out.println("Multiplication is: " + (num1 * num2));
            } else if (operator.equals("/")) {
                System.out.println("Division is: " + (num1 / num2));
            } else if (operator.equals("%")) {
                System.out.println("Reminder is: " + (num1 % num2));
            } else {
                System.out.println("Invalid Operator");
            }

            System.out.println("Do you wanna continue");
            String answer = input.next();

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using calculator");
                break;
            }

        }


    }
}
