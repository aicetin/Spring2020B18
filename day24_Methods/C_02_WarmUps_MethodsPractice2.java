package day24_Methods;
import java.util.Scanner;

/*
1. write a methods that can return the maximum number between two numbers
         Ex: Max(10, 20) ==> 20
2. write a method called Calculation, that passes 3 parameters: 2 numbers and one operator, and prints out the calculation
      if operator is not between [-, +, *, /, %] output should be Invalid Operator
      Ex: calculate(10, 2, '*') ==> 20;
         calculate(10, 2, '&') ==> Invalid operator
         NOTE: The method MUST take three arguments when it's called
 */
public class C_02_WarmUps_MethodsPractice2 {
    // Task 1. Max number:
    public static void Max (int num1, int num2) {
        if(num1>=num2){
            System.out.println("Maximum number is: "+num1);
        }else{
            System.out.println("Maximum number is: "+num2);
        }
        System.out.println("===================================================================");
    }
    public static void Calculation (double num1, double num2, char operator){
        //Task 2. Calculation
        switch (operator){
            //case has to be char just like switch
            case '+':
                System.out.println(num1+num2);
                break;          // we have to add break after each so it doesn't continue to next
            case '-':
                System.out.println(num1 - num2);
                break;
            case'*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case'%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Invalid");
                System.out.println("==============================================================");
        }
    }
    // HERE IS OUR MAIN METHOD WHERE WE CAN CALL OTHER METHODS
    public static void main(String[] args) {
        int a = 1000000;
        int b = 200;
// this is the Max method we created
        // we can either use new numbers we assign (even though they are int they can be assigned to double)
        Max(a,b);
        // or we can call it like this:
        Max(317,45);
        // This is the Calculation method we created
        Calculation(10,20,'*');
        Calculation(30,40,'+');
        // we can use other numbers that we assign like this:
        int n1 = 10000;
        int n2 = 100;
        Calculation(n1, n2, '/');
        // we apply loop here to repeat those steps
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter num1: ");
            int num1 = scan.nextInt();
            System.out.println("Enter num2: ");
            int num2 = scan.nextInt();
            System.out.println("Enter operator");
            // because there is no char in Scanner so we add String next() then we call first index
            char opertor = scan.next().charAt(0);
            Calculation(num1, num2, opertor); // result of calculation
            System.out.println("Do you want to continue?");
            String answer = scan.next();
            // we have to create another loop inside our loop to make sure it only repeats if answer is Yes or no -->
            // --> we need to keep asking using to re-enter
            while ( ! (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.out.println("Invalid Entry, Please re-enter yes or no:");
                System.out.println("Do you want to continue?");
                answer = scan.next();
            }
            if (answer.equalsIgnoreCase("No")){
                break;
            }
        }
    }
}