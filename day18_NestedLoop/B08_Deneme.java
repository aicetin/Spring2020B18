package day18_NestedLoop;

public class B08_Deneme {
    public static void main(String[] args) {
        for (int j = 1; j <= 9; j++) {


            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }

            System.out.println();

        }
        System.out.println("====================================");
        for (int j = 9; j >= 0; j--) {


            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("==================================");

        for (char z = 'a'; z <= 'z'; z++) {


            for (char ch = 'a'; ch <= z; ch++) {
            System.out.print(ch+ " ");

            }
            System.out.println();


        }

        System.out.println("===========================");

        for (char z = 'z'; z >= 'a'; z--) {


            for (char ch = 'a'; ch <= z; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}


