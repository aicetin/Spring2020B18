package OfficeHours.ExtraPractice_05_09_2020;
/*
Given a string of even length, return a string made of the middle two chars, so the string
 "string" yields "ri". The string length will be at least 2.

middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
 */
public class MiddleTwoClass { public String middleTwo(String str) {

    int mid1= str.length()/2 -1;
    int mid2= str.length()/2;


    // String word = "" + str.charAt(mid1) + str.charAt(mid2);
    // return word;

    return str.substring(mid1,mid2+1);

}


}