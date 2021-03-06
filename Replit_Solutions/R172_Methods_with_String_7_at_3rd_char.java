package Replit_Solutions;
/*
at3 gets two strings and returns a string.
the first string is the one that will be manipulated. at the 3rd char position of target
you will insert the word argument.
example use:

at3("longword","foo")
will return: "lonfoogword"

at3("blabla","a")
will return: "blaabla"
 */
public class R172_Methods_with_String_7_at_3rd_char {
    public static String at3(String target,String word)
    {
        //WRITE YOUR CODE HERE
        return target.substring(0,3)+word+target.substring(3);

    }

    public static void main(String[] args) {
        String s = "longword";
        String r = "foo";
        String result = at3(s,r);
        System.out.println(result);
    }
}