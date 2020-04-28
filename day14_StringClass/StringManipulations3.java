package day14_StringClass;

public class StringManipulations3 {

    public static void main(String[] args) {

        String str1 = "CYBERTEK";
        String str2 = "cybertek";

        System.out.println( str1.equals(str2) ); // false

        System.out.println(str1.equalsIgnoreCase(str2) ); // true, ignores case sensitivity


        String s1 = "Cybertek School";

        boolean r1 =   s1.contains("school");   // false

        System.out.println(r1);

        System.out.println("==============================");
        String s7= "United States is the biggest country in the world";
        boolean r2 = s7.contains("country");
        System.out.println(r2);

        System.out.println("=========================");

        String s3 = "United States";
        System.out.println( s3.startsWith("U") );  // true

        String s4 = "Cybertel School";
        System.out.println( s4.endsWith("l") );  // true
        System.out.println( s4.endsWith("School") ); // true

        System.out.println(s4.endsWith("Cybertek")); // false



    }


}