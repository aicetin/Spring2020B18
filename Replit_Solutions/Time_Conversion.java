package Replit_Solutions;
/*
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
Function Description
It should print a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):
s: a string representing time in  12 hour format

Input: 07:05:45PM
Output: 19:05:45
 */
import java.time.LocalTime;
import java.util.*;
public class Time_Conversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        String time = s;
        String[] arr = time.substring(0, time.length() - 2).split(":");
        int[] numArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numArr[i] = Integer.parseInt(arr[i]);
        }
        int hour = numArr[0];
        int min = numArr[1];
        int second = numArr[2];
        if (s.contains("PM")) {
            if (second == 0) {
                LocalTime tm = LocalTime.of(hour + 12, min, second);
                System.out.println(tm + ":00");
            } else {
                LocalTime tm = LocalTime.of(hour + 12, min, second);
                System.out.println(tm);
            }
        } else {
            if (second == 0) {
                LocalTime tm = LocalTime.of(hour, min, second);
                System.out.println(tm + ":00");
            } else {
                LocalTime tm = LocalTime.of(hour, min, second);
                System.out.println(tm);
            }
        }
    }
}