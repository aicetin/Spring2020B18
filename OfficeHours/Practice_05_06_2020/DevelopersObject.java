package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class DevelopersObject {

    public static void main(String[] args) {
        Developer developer1 = new Developer();
        System.out.println(developer1);
        developer1.setInfo("Mehmet", "Senior Developer", 160_000, 12335663 );
        System.out.println(developer1);

        Developer developer2 = new Developer();
        developer2.setInfo("Leon", "Senior Developer", 110_000, 14151516);

        developer1.coding();
        developer2.coding();

        developer1.fixingBug();
        developer2.fixingBug();

        System.out.println("=====================================================================");

        Developer[] arr = {developer1, developer2};
        /*
        for(int i = 0; i<arr.length; i++){

            System.out.println(arr[i]);

         */
        for( Developer each : arr){
            System.out.println(each);
            //System.out.println(each.name+ " "+each.salary);

            System.out.println("=================================================");

        ArrayList<Developer> developers = new ArrayList<>(Arrays.asList(arr));
            // developers.addAll(Arrays.asList(developer1,developer2));

        System.out.println(developers.size());
            /*
            for(int i = 0; i< developers.size(); i++){
                System.out.println(developers.get(i).name);

            */

        for( Developer each1: developers){

                System.out.println(each1);


            }



        }







    }




}
