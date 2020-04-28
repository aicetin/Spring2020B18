package day26_MethodOverLoading;

public class A06_MethodOverLoading4 {
    public static void main(String[] args) {
        System.out.println("String");
    }

    public static void main(double[] args) {
        System.out.println("Double");
    }

    public static void main(int[] args) {
        System.out.println("Int");
    }

}