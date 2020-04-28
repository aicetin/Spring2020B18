package day10_Switch_Scanner;

public class NumberToWords {
    public static void main(String[] args) {
    // 0~9
        int num = 9;

        String word = (num ==0)?"Zero" :(num ==1)?"One" :(num ==2)?"Two":(num ==3)?"Three" :(num ==4)?"Four"
                :(num ==5)?"Five":(num ==6)?"Six":(num ==7)?"Seven":(num ==8)?"eight":(num ==9)?"Nine":"Invalid";

        System.out.println(word);
    }

}
