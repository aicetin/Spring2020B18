package day22_Arrays_Loops;

import java.util.Arrays;

public class A01_Deneme {
    public static void main(String[] args) {
        int[] numbers = new int[20];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));

            for (int each : numbers) {

                if (each % 2 != 0) {
                    continue;
                }
                System.out.print(each+ " ");
            }

        }
}

