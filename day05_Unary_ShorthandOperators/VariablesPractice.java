package day05_Unary_ShorthandOperators;

public class VariablesPractice {

    public static void main(String[] args) {
// whole numbers: byte, short, int, long
        // decimals: float, double

        int a1 = 100;
        float f1 = (long)a1;
        //     = 100L;
        //     = 100.0
        System.out.println(f1);

        long l1 = (long)f1;
          // l1  = 100
        System.out.println(l1);

        String name;
        // System.out.println(name);

        name = "Cybertek"; // in java: first come first serve
        System.out.println(name);






    }

}
