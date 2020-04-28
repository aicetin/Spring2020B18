package Replit_Solutions;
/*
Complete a method fib() that will compute Fibonacci numbers
In Fibonacci series, next number is the sum of previous two numbers
for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……... The first two numbers of Fibonacci
series are 0 and 1.
Given a number num, print n-th Fibonacci Number.
Input  : 2
Output : 1

Input  : 9
Output : 34
 */
import java.util.*;
public class R155_Methods_17_Fibonacci_numbers_Void_Methods {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    fib(num);
    //   6==>8
}
    public static void fib(int num){
        //WRITE YOUR CODE HERE

        int[] arr = new int[num+1];
        arr[1] =1;
        for(int i = 0; i<=num-2; i++){
            arr[i+2]=arr[i+1]+arr[i];
            // i=0   1        1       0
            // i=1  2        1       1
            // i=2  3        2       1
            // i=3  5        3       2
            // i=4  8        5       3
        }
        System.out.println(arr[num]);


        /*
        int []fib=new int[num+1];
        int k=1;
        for (int i=1; i<fib.length;i++){
            fib[i]=k;
            k+=fib[i-1];
        }
        System.out.println(fib[num]);

         */
            /*
        int n1 = 0;
        int n2 = 1;
        int fib[] = new int[num +1];
        for (int i = 1; i <=num; i++) {
            int sum = n1 + n2;
            fib[i] = n2;
            n1 = n2;
            n2 = sum;
        }
        System.out.println(fib[num]);

             */
    }
}