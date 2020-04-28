package OfficeHours.Practice_03_18_2020;

public class ShortHandOperators_Practice {
    public static void main(String[] args) {
        // +=: addition assignment

        int a = 100;
        //  a = a + 200;
        a += 200; // a= 300

        System.out.println(a);

        a += 200 * 3;  // a = 900
    //  a += 600 ==> 300+600 ==>900
        System.out.println(a); //900

        System.out.println("=========================");

        // -=: subtraction assignment
        // a = a - 400;  ==> 900-400 ==> 500
        a -= 400;  //a =500

        System.out.println(a);

        System.out.println("=========================");

        int b = 300;
        b  -=  3 * 40;
    //  b  -= 120; ==> 180
        System.out.println(b);

        System.out.println("=========================");
        // *=: multiplication assignment
        int x = 5;

    //  x = x * 3; // ==> 15
        x *= 3;  // ==> 15

        System.out.println(x);

        System.out.println("=========================");

        x *= 2+1;
    //  x *= 3;  x = x * 3 ==> 15 * 3 ==> 45

        System.out.println(x);


        System.out.println("=========================");

        //  /=: division assignment:

        int n = 900;

        // n = n / 3;

        n /= 3; // 300

        System.out.println(n);

        System.out.println("=========================");

        n /= 3 * 5; // n = n / 15  ==> 300 / 15 ==> 20

        System.out.println(n);

        System.out.println("=========================");

        // %=: remainder assignment
        // remainder: numerator - (denominator * Whole Number for result)

        int m = 10;
        //  m= 10 - (3 * 3) ==> 1
        //  m = m % 3; //1

        m %= 3; // m=1
        System.out.println(m);

        System.out.println("=========================");

        int y = 300;

        y %= 3*5;
        // remainder: numerator - (denominator * Whole Number for result)
        //          =   300  -    (       15  *    (300/15=20)    )--> 300 - 300==> 0
        // y %= 15; ==> y = y%15 ==> y=0
        System.out.println(y);

        System.out.println("=========================");

        int  t = 400;//
        t %= 10*2;
        // remainder: numerator - (denominator * Whole Number for result)
        //          =   400     - ( 20   * 400/20 )==> 400 - 400 ==> 0
        // t %= 20 ==> t = t % 20; ==> t = 0

        System.out.println(t);

        int k = 3;
        k %= 2;
     //  k = 3- (2*3/2)==> 3-2= 1
        System.out.println(k);
        System.out.println("=========================");

        // 3000- (1000*3000/1000) ==> 3000-3000=0
        int c= 3000;
        c %= 1000;
        System.out.println(c);

        System.out.println("=========================");










    }

}