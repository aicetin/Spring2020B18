package Replit_Solutions;
/*
This method gets a string and an int, it returns a string.
what it dose is limit the inputted string to a cretin number of characters.
for example:
limit("abcd",2)
returns "ab"

limit("bla bla",3)
returns "bla"

hint:
https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#substring(int)
 */
public class R171_Methods_with_String_6_limit_string {
    public static String limit(String text, int maxLength)
    {
        //WRITE YOUR CODE HERE
        /*
        String str = "";
        for(int i = 0; i<text.length(); i++ ){
            if (str.length()<maxLength){
                str+=text.charAt(i);
            }
        }
        return str;

         */
        String a = text.substring(0, maxLength);
        System.out.println(a);
        return a;

    }
}
