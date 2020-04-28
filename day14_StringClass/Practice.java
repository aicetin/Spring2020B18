package day14_StringClass;

public class Practice {
    public static void main(String[] args) {
        String gmail = "cybertekschool@gmail.com";

        String userinputGmail = "CybertekSchool@gmail.com";

        // boolean result = (gmail.equals(userinputGmail)); // false
        boolean result = (gmail.equalsIgnoreCase(userinputGmail)); // true
        System.out.println(result);//  Logged in

        if (result) {
            System.out.println("Logged in");
        }

        String s1 = "Cybertek School";
        boolean r1 = s1.contains("School");  // true
        System.out.println(r1);

        System.out.println("=======================");

        /*
        valid password MUST contain a special characters such as (!, _, $ )
        valid password should not contain spaces
         */
        String Password = "mmasd 1235";

        if (Password.contains(" ")) {
            System.out.println("Password cannot have space in it");
        } else {
            System.out.println("valid password");
        }

        String s3 = "United States";
        System.out.println(s3.startsWith("U"));  // true

        System.out.println("========================");

        /*
        every website has "www." at the begenning of the web address
         */

        String webAddress = "Www.amazon.com";
        webAddress = webAddress.toLowerCase();

        if( webAddress.startsWith("www.") ){
            // false
            System.out.println("valid");

        }
        String s4 = "Cybertek School";
        System.out.println(s4.endsWith("l"));  //true
        System.out.println(s4.endsWith("School"));  // true

        System.out.println("===========================");
         /*
        every single gmail address ends with @gmail.com
         */

        String email = "CybertekSchool@Yahoo.com";

        if(email.endsWith("@gmail.com")){
            System.out.println("valid Gmail");
        }else{
            System.out.println("Invalid gmail");
        }





    }


}