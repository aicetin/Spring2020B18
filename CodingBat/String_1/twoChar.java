package CodingBat.String_1;

import java.util.Scanner;

public class twoChar { /*Given a string and an index, return a string lengthMethods 2 starting at the given index.
    If the index is too big or too small to define a string lengthMethods 2, use the first 2 chars.
    The string lengthMethods will be at least 2.
     twoChar("java", 0) → "ja"
     twoChar("java", 2) → "va"
     twoChar("java", 3) → "ja"
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = scan.next();
        System.out.print("Enter index: ");
        int index = scan.nextInt();
        String result = "";

        if (str.length() >= 2) {
            result=""+str.charAt(index) + str.charAt(index + 1);
        }else if((index+2)>str.length()){
            result=""+str.charAt(0) + str.charAt(1);
        }
        System.out.println(result);

    }
}