package day21_MultiDimensionalArrays;
/*
Task:
    given an array:
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elements could be more in the array
    print all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP
 */
public class A06_Emails_WUT {
    public static void main(String[] args) {
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}; // 10

        for(String EachEmail : emails) {  // 10

            if(EachEmail.endsWith("@gmail.com")){
                continue;
            }

            System.out.println(EachEmail);
        /*
           if (!EachEmail.endsWith("@gmail.com")) {
               System.out.println(EachEmail);
           }
         */

        }


        //   System.out.println(EachEmail);










    }


}