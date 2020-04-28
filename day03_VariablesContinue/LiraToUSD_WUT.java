package day03_VariablesContinue;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class LiraToUSD_WUT {
    /*

    task 05:
    create a class called LiraToUSD, and write a program that can convert lira to dollars, and print the result
            Ex:
            if Lira = 1000;
    output:
            1000 Liras is equal to 160.97 USD
			if Lira = 1000000;
    output:
            1000000 is equal to 160969.70 USQ

     */


    public static void main(String[] args) {
        int lira = 1000;
        double usd = lira * 0.16097;
        System.out.println(lira+" Lira is equal to "+usd+" USD");
        lira = 1000000;
        double usq = lira * 0.16097;
        System.out.println(lira+" Lira is equal to "+usq+" USQ");
    }








}
