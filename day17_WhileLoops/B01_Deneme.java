package day17_WhileLoops;

import java.util.Scanner;

public class B01_Deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int MaxNumber = -2147483647;
        int MinNumber = 2147483647;

        for(int i = 1; i<6; i++){
            System.out.println("Enter a number");
            int num = input.nextInt();

            if(num>MaxNumber){
            MaxNumber = num;

            if(num<MinNumber){
                MinNumber = num;
            }
    }
    }
        System.out.println("Maximum number is: "+MaxNumber);
        System.out.println("Minimum number is: "+MinNumber);
    }

}




