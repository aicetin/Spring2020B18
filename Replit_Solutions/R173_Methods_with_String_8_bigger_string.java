package Replit_Solutions;

/*
the method gets two strings and return the longest one

biggerS("apple","orange") ==> "orange"
 */
public class R173_Methods_with_String_8_bigger_string {
    public static String biggerS(String a, String b) {
        //WRITE YOUR CODE HERE
        if (a.length() > b.length()) {
            return a;
        } else {
            return b;
        }

    }
}