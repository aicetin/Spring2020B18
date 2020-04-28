package Replit_Solutions;
/*
uniqueChars is a method that you will code now, should be able to accept any string in the world and
 return unique characters from the parameter.

Examples:
uniqueChars("java") ==> "jav"

uniqueChars("mama") ==> "ma"

uniqueChars("spoon") ==> "spon"
 */
import java.util.*;
public class R167_Methods_with_String2_Remove_Duplicates_Duplicates {
    public static void main(String[] args) {
        //test your code
        System.out.println( uniqueChars("BugBusters") ) ;
    }

    public static String uniqueChars(String str) {
        //TODO: write your below
        String nonDupl = "";
        for(int i = 0; i <str.length(); i++){
            if(!nonDupl.contains(""+str.charAt(i))){
                nonDupl += str.charAt(i);
            }
        }
        return nonDupl;

    }
}
