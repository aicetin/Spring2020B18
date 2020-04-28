package Replit_Solutions;

import java.util.Scanner;

public class Replit_string_charAt {
    /*
using charAt method output the 5th letter of txt string then the 6th letter then the 6th letter.

use print not println.
 */

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your letter");
    String txt = s.next();
    System.out.print(txt.charAt(2));
    System.out.print(txt.charAt(4));
    System.out.print(txt.charAt(5));
    }
}
