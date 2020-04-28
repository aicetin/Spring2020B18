package Replit_Solutions;

/*
Create a method printHollowRect that prints a 5 on 5 hollow rectangle:

*****
*   *
*   *
*   *
*****

hint:you will need to use two nested for loops for that, and an if that checks if its the last or
first iteration of the loop (so you will know whet to print "*" or " ")
 */
public class R143_Methods5_simple_print_pattern_Void_Methods {
    public static void printHollowRect(){
        // write your code here:
        for(int i = 1; i <= 5; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i =1; i <= 3; i++){
            System.out.println("*   *");
        }
        for(int i = 1; i <= 5; i++){
            System.out.print("*");



        }



    }// end your code

    public static void main(String[] args) {

        printHollowRect();
    }
}

