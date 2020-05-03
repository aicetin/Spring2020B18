package Replit_Solutions;

/*
The method gets a string and returns a string minus the first letter.
for example:
removeFirst("aaa")
returns "aa"
 */
public class R174_Methods_with_String_9_remove_first_char {
    public static String removeFirst(String target) {
        //WRITE YOUR CODE HERE
        String result = target.substring(1);
        System.out.println(result);
        return result;

    }


}
