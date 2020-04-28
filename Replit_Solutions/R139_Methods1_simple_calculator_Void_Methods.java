package Replit_Solutions;
/*
create a static method called "plus", its return is void and it gets no arguments.
It asks the user to input two numbers, then it will add them and print the result.
Create a scanner within plus method.
Example:

enter first number:
1
enter second number:
2
result: 3
 */
import java.util.Scanner;
public class R139_Methods1_simple_calculator_Void_Methods {
    public static void main(String[] args) {

        plus();
    }

    public static void plus(){

        //your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first numbers");
        int num1 =input.nextInt();
        System.out.println("Enter second numbers");
        int num2 =input.nextInt();
        System.out.println("result: "+ (num1+num2));


    }
}
