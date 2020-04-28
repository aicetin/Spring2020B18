package Replit_Solutions;
/*
Clunker Motors Inc. is recalling all vehicles in its Extravagant line from model years 2010-2012
as well all vehicles in its Guzzler line from model years 2015-2018. A boolean variable named recalled
 has been declared.
Given a variable year and a String model write a statement that prints true to recalled
 if the values of year and model match the recall details and prints false otherwise.
 */

import java.util.*;

public class R_Assessment_3_1_CarFactory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your car's model");
        String model = scan.next();
        System.out.println("Enter your car's year");
        int year = scan.nextInt();
        boolean recalled = false;
        // WRITE YOUR CODE HERE

        for(int i = 2010; i <= 2012; i++){
            if(model.equalsIgnoreCase("Extravagant") && year == i){
             recalled = true;

            }
        }
        for(int k = 2015; k <= 2018; k++){
            if(model.equalsIgnoreCase("Guzzler") && year == k){
                recalled = true;
            }
        }
        System.out.println(recalled);
    }
}
