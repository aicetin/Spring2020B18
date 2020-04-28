package Replit_Solutions;
/*
In this exercise you get a string called txt .
output txt without its last letter.

for example:
txt = "foo"
output will be:
fo
 */

import java.util.*;

public class R079_String_no_end_String_method {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here

        String word = txt.substring(0, txt.length() - 1);
        System.out.println(word);


    }
}
