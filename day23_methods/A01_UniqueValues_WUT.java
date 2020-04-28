package day23_methods;
/*
 1.  Write a program that can print out the unique values from a String Array
            Ex:
                if arr -> {"A", "A", "B", "C", "C"}
                output: B
                if arr -> {"A", "B", "B", "C"}
                output:  A
                         C
            MUST use for each loop
 */

public class A01_UniqueValues_WUT {
    public static void main(String[] args) {

        String[] arr = {"A", "B", "A", "C", "D"};  // B
                //       0    1    2    3    4

        for(int j=0; j < arr.length; j++){ // 5:  A  B A C D

            int count2 = 0;
            for(int i =0; i < arr.length; i++ ){
                if( arr[i].equals(arr[j]) ){
                    count2++;
                }
            }

            if(count2 == 1){
                System.out.println(arr[j]);
            }

        }


        System.out.println("=============================================");

        // solution2:
        for( String each2 : arr ){ // 5:  A  B A C D

            int count = 0;
            for( String each : arr ){
                if(each.equals(each2)){
                    count++;
                }
            }

            if(count == 1){  // if the character is unique
                System.out.println(each2);
            }


        }




    }


}