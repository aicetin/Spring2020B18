package OfficeHours.Practice_04_15_2020;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class deneme {
    public static void main(String[] args) {
        String[] names = { "ali", "veli", "selami", "naim"   };

        int length = names.length;
        String[] namesRev = new String[length];

        int i = 0;
        int k = length - 1;
        while (i < length){
        namesRev[i] = names[k];
        System.out.println(k);

        i++;
        k--;
    }

        System.out.println(Arrays.toString(namesRev));

    }
}
