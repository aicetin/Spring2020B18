package day18_NestedLoop;

import java.util.Scanner;

public class B02_Deneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int result = 1;

        while (num >= 1){
            result = result*num;
            num--;
        }
        System.out.println(result);
    }
}
