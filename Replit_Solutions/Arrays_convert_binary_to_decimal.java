package Replit_Solutions;
/*
Binary number is a number expressed in the base-2 numeral system or binary numeral system,
which uses only two symbols: typically 0 (zero) and 1 (one). Each digit is referred to as a bit.

Given an array binary with 8 integers (0s or 1s), write java program to calculate decimal value and
print out to console. Feel free to use additional arrays or formulas.
Example:
binary -> [0, 0, 0, 0, 0, 0, 1, 1]
print 3

binary -> [0, 0, 1, 0, 0, 0, 1, 1]
print 35

binary -> [1, 1, 1, 1, 1, 1, 1, 1]
print 255

 */
import java.util.*;
public class Arrays_convert_binary_to_decimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] binary = new int[8];
        for(int i =0; i < binary.length; i++) {
            binary[i] = input.nextInt();
        }

        //TODO: Write your code below.
        /*
        int n=128;
        int result=0;
        for (int dec:binary){
            result+=((int)dec*n);
            n=n/2;
        }
        System.out.println(result);
         */
        int result = 0;
        int k = binary.length-1;
        for ( int j = 0 ; j < binary.length ; j++ ) {
            result += ( binary[j] * Math.pow(2,k) );
            k--;
        }
        System.out.println(result);

    }
}