package OfficeHours.Practice_03_11_2020;

public class Practice_Variables {

        /*
        brand
        year
        price
        model
        Maximummiles

         */
        public static void main(String[] args) {
            String brand = "BMW";
            short year = 2020;
            float price = 50000.50f;
            String model = "X6";
            Short maximummiles = 32767;





            System.out.println(brand);
            System.out.println( "brand" );
            // variables that are decleared in a block, must be initiliazed before use

            /*
            output
            The vehicle 2020 BMW X6, has 32767 miles, price is 50000.5 dollars
              */
            System.out.println("The vehicle" + " " +year + " " +brand +" " +model+ " " + "has" + " " +maximummiles+ " " +
             "miles, price is" + " " +price+ " " + "USD");

            /*
            additionVS comcatination
            System.out.println( 9 + 10 ); // 19 addition: both left and right side of the + values
            System.out.println("9"+"10"); // 910
            System.out.println("9"+ 10); //910

             */



    }


}
