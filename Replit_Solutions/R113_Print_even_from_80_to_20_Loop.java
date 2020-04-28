package Replit_Solutions;

/*
Write a for loop that prints all the even integers from 80 through 20 inclusive, separated by spaces.
MUST USE FOR EACH LOOP
 */
public class R113_Print_even_from_80_to_20_Loop {
    public static void main(String[] args) {
        String nums="";
        for(int i=80;i>=20;i-=2){
            nums+=i+" ";
        }
        String[]num=nums.split(" ");
        for(String each:num){
            System.out.print(each+" ");

        }
    }

}