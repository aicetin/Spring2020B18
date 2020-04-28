package Replit_Solutions;
/*
using substring method output the first two letters of text string
for example:
String txt = "foo"
the first two letters are "fo"

use print not println.
 */
import java.util.Scanner;
public class Replit_string_substring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your letter");
        String txt = s.next();
        String firstTwoLetters=txt.substring(0,2);
        System.out.print(firstTwoLetters);

    }
}
