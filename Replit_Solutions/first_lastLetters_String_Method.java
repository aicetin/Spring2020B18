package Replit_Solutions;

import java.util.Scanner;

public class first_lastLetters_String_Method {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your First Name");
        String firstName = input.nextLine();
        System.out.println("Enter your Last Name");
        String lastName = input.nextLine();
        String initials = ""+ firstName.charAt(0)+lastName.charAt(0);
        initials=initials.toUpperCase();
        System.out.println(initials);

        System.out.println("===========================");

        String LastLetters = ""+firstName.charAt(firstName.length()-1)+ "." +lastName.charAt(lastName.length()-1);
        System.out.println(LastLetters);

        System.out.println("============================");

        int FirstNameIndex = firstName.length()-1;
        int LastNameIndex = lastName.length()-1;

        String LastLetters2 = ""+firstName.charAt(FirstNameIndex)+ "." +lastName.charAt(LastNameIndex);
        System.out.println(LastLetters2);
            LastLetters2=LastLetters2.toLowerCase();

        System.out.println("============================");

        String LastLetters3 = firstName.substring(FirstNameIndex, FirstNameIndex+1)+ "." +lastName.substring(LastNameIndex, LastNameIndex+1);
        System.out.println(LastLetters3);
        LastLetters3=LastLetters3.toLowerCase();




    }
}
