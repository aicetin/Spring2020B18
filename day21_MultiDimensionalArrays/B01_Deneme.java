package day21_MultiDimensionalArrays;

import java.text.DecimalFormat;

public class B01_Deneme {
    public static void main(String[] args) {
        DecimalFormat Df = new DecimalFormat("0.00");
        double[] arr = {1,2,2};

        int length = arr.length;
        double sum = 0;

        for(int i = 0; i< length; i++){
            double eachNum = arr[i];
            sum += eachNum;
        }

        System.out.println(sum);
        double average = sum/length;

        System.out.println(average);
        System.out.println(Df.format(average));


    }
}
