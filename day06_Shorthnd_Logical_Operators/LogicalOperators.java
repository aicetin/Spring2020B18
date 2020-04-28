package day06_Shorthnd_Logical_Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean result1 = true;
        System.out.println(!result1);  // false


        boolean result2 = 10 + 15 > 15;
        System.out.println(result2);
        System.out.println("=============");


        boolean result3 = !(10 + 15 > 15);  // false
        System.out.println(result3);

        boolean result4 = !true == !false;
             //         = false == true  // false
        System.out.println(result4);

        System.out.println("=========================");


        boolean R1 = "Corona virus" != " End of the World" && "Toilte paper" == "Cure";
            boolean R2 = 10 > 15 && 15 < 13;
               //       = false && false ==> false
        System.out.println(R1);
        System.out.println(R2);


        boolean R3 = 'a' == 'b' - 1  && 'b' + 1 == 'c';
          //       =  97 == 98-1  &&  98+1 ==99 ==> true


        boolean R4 = true != false || false == !true ;
            //   =    true   || true  ==> true
        System.out.println(R4);  // true



        boolean R5 = true!= false && !false == !true;
            //      = true   && false    ==> false
        System.out.println(R5);  // false



        boolean R6 = !!!false;
               //    !!true
               //     ! false
               //     true
        System.out.println(R6); //true


    }


}
