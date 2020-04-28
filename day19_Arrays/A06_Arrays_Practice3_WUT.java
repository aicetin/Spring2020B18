package day19_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
// write a program that asks "enter a name" 10 times, and store each of the names in the array students

 */
public class A06_Arrays_Practice3_WUT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] students = new String[10];
        System.out.println("Please enter 10 students name");

        for(int i = 0; i < students.length; i++){

           students [i]= scan.nextLine();

    }

        System.out.println(Arrays.toString(students));
    }
}


