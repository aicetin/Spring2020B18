package day27_DateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class C04_Dates_Formatting {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now(); // it will return current date
        System.out.println(date1);
        // If I don't like the format, I need to call the DateTimeFormatter class
        // then I provide what format I will like to use to format date

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        /*
         year: yy, yyyy
         Month: MM(number), MMM (three letters), MMMM (full name of month)
         day : dd(number)
         */

        System.out.println(date1.format(dtf));  //  2020/04/23
        //OR
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy"); // MM prints month as 2 digit number
        System.out.println(date1.format(dtf2)); //  04/23/2020
        //OR
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMM dd, yyyy"); // MMM will print first 3 letters of month
        System.out.println(date1.format(dtf3)); //  Apr 23, 2020
        // OR
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println(date1.format(dtf4)); //  23/Apr/2020

        System.out.println("=============================================================================");
        /*
        Create a date called birthDay: month/Days/year
        ex: 2020 04 23 ==> Apr/23/20
         */

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MMM/dd/yy");
        LocalDate date2 = LocalDate.of(1999,12,25);
        System.out.println(date2.format(dtf5));     // Dec/25/99
        // since this method returns us string ==> we can assign to string to make it reusable:
        String str1 = date2.format(dtf5);
        // IF WE CHANGE MONTH TO MMMM (4 CAPTIAL M) ==> IT WILL PRINT THE WHOLE NAME OF THE MONTH
        // E or EE or EEE before date will print the name of day: Mon
        // EEEE before date will print the full name of day : Monday

        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("E MMMM/dd/yy");
        LocalDate date3 = LocalDate.now();
        System.out.println(date3.format(dtf6));     //  Thu April/23/20

        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("EEEE MMMM/dd/yy");
        System.out.println(date3.format(dtf7));     //  Thursday April/23/20
    }
}