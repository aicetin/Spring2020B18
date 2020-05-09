package OfficeHours.ExtraPractice_05_02_2020;

public class ExtraEndClass {
    public static void main(String []args) {
        String s = extraEnd("hello");
        System.out.println(s);
    }


    public static String extraEnd(String str) {

        String end = str.substring(str.length()-2);

        return end + end + end;

    }



}