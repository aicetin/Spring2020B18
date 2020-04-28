package day19_Arrays;

public class B02_Deneme {
    public static void main(String[] args) {
        String str = "AABCC";
        String result = "";
        String nonDub = "";

        for (int i = 0; i <= str.length()- 1; i++) {
            if (!nonDub.contains(""+str.charAt(i))) {
                nonDub += str.charAt(i);
            }

        }

        System.out.println(nonDub);


        System.out.println("=================================");

        for(int j = 0; j <= nonDub.length()-1 ; j++) {
            char ch = nonDub.charAt(j);

            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            result += " " + ch + count;
        }

        System.out.println(result);
    }
}
