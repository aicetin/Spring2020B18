package day07_IfStatements;

public class If_Else_Statement {
    public static void main(String[] args) {

        int number = 100;

        if(number % 2 == 0){
            System.out.println(number+ " is even number");
        }
        if(number % 2 != 0){
            System.out.println(number+ " is odd number");
        }

        System.out.println("======================"); // or we can use that one

        if(number % 2 == 0){
            System.out.println(number+ " is even number");

        } else { // otherwise
            System.out.println(number+ " is odd number");
        }
        /*
        boolean evenNum = number % 2 == 0
        if(evenNum % 2 == 0){
            System.out.println(number+ " is even number");

        } else { // otherwise
            System.out.println(number+ " is odd number");
        }

         */

        int age = 30;
        if(age >= 21){
            System.out.println("Here is your Vodka");
        } else {
            System.out.println("Go home kid");
        }

        boolean testedPositiveForCorona = true;
        if(testedPositiveForCorona){
            System.out.println("Buy more toilet papers and stay home");
        } else{
            System.out.println("Come to work");
        }


    }
}
