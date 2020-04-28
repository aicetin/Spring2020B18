package day05_Unary_ShorthandOperators;

public class Divisibility_WUT {
    /*
     2. write a program that can check if a number is evenly divisible by 2, 3, 5,
            Ex:
                number = 65; ==> int
                divisibleBy2 ==> true/false
                divisibleBy2 ==> true/false
                divisibleBy2 ==> true/false

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
     */
    public static void main(String[] args) {
        int number = 65;
        // DataType Variable = Data;
        boolean divisibleBy2 = number % 2 == 0;
        // the number can be devided by 2 without any reminder,

        boolean divisibleBy3 = number % 3 == 0;
        // the number can be devided by 3 without any reminder,

        boolean divisibleBy5 = number % 5 == 0;
        // the number can be devided by 5 without any reminder,

        System.out.println(divisibleBy2);
        System.out.println(divisibleBy3);
        System.out.println(divisibleBy5);
        System.out.println("===============================");
        String result1 = number +" is divisible by 2:"+ divisibleBy2; // concatenation
        String result2 = number +" is divisible by 3:"+ divisibleBy3;
        String result3 = number +" is divisible by 5:"+ divisibleBy5;

        System.out.println("finalResult");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println("======================");
        // System.out.println(result1 + "\n" +result2 +"\n" +result3);
        String finalResult = result1 + "\n" +result2 +"\n" +result3;

        /*
        number = 80;
            output:
                80 is divisible by 2: true
                80 is divisible by 3: false
                80 is divisible by 5: true

         */
        System.out.println("============================");
        int number2 = 80;
        boolean divisibleBy6 = number2 % 2 == 0;
        boolean divisibleBy7 = number2 % 3 == 0;
        boolean divisibleBy8 = number2 % 5 == 0;
        System.out.println(divisibleBy6);
        System.out.println(divisibleBy7);
        System.out.println(divisibleBy8);
        String result6 = number2 + " divisible is by 2 "+ number2;
        String result7 = number2 + " divisible is by 3" + number2;
        String result8 = number2 + " divisible is by 5" + number2;
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);






    }

}
