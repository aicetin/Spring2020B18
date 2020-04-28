package Replit_Solutions;
/*
using indexOf method output the position of b inside txt string.
then output the index of "foo"

use System.out.println() to output each index of requested.
 */

import java.util.*;

public class string_indexOf {
    public static void main(String[] args) {

        String txt = "foo bar";
        //your code here
        int a1 = txt.indexOf("b");
        System.out.println(a1);
        int a2 = txt.indexOf("foo");
        System.out.println(a2);

    }
}
