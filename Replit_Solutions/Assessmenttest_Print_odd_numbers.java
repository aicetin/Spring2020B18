package Replit_Solutions;
/*
Write a  for loop that prints the odd integers 11 through 121 inclusive, separated by spaces.
 */
public class Assessmenttest_Print_odd_numbers {
    public static void main(String[] args) {
        // WRITE YOUR CODE HERE
        for (int i= 11; i <= 121; i++){
            if(i % 2 != 0){
            System.out.print(i+" ");
            }
        }
    }
}
