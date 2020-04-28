package day17_WhileLoops;

public class B02_Deneme {
    public static void main(String[] args) {
        String result = "";

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                //System.out.print("FINRA" + " ");
                result += "FINRA"+" ";
            } else if (i % 3 == 0) {
                //System.out.print("FIN" + " ");
                result += "FIN"+" ";
            } else if (i % 5 == 0) {
                //System.out.print("RA" + " ");
                result += "RA"+" ";
            } else {
                //System.out.print(i + " ");
                result += i+ " ";
            }
        }
        System.out.print(result);
    }
}
