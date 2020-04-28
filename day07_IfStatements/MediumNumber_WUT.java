package day07_IfStatements;

public class MediumNumber_WUT {
    /*
    4. write a java program that accepts three numbers and return the medium number
				(assume that none of them are equal)
     */
    public static void main(String[] args) {
        double a = 100;
        double b = 2000;
        double c = 30;

        /*
        a: if (a < b && a > c) or (a > b && a < c)
        b: if (b < c && b > a) or (b > c && b < a)
        c: if (c < b && c > a) or (c > b && c < a)
         */

        boolean aMedium = (a < b && a > c) || (a > b && a < c);
        //            =   b < a < c or   c < a < b
        boolean bMedium = (b < c && b > a) || (b > c && b < a);
        //           =    c < b< a  or     a < b < c
        boolean cMedium = (c < b && c > a) || (c > b && c < a);
        //           =    a < c < b  or  b < c < a

        if (aMedium) {
            System.out.println(a + " is the medium number");
        }
        if (bMedium) {
            System.out.println(b + " is the medium number");
        }
        if (cMedium) {
            System.out.println(c + " is the medium number");
        }
    }
}





