package day35_Static;

import OfficeHours.Practice_05_06_2020.ScrumTeam;

public class Offer {
    /*
    Warmups:
1. Create a class called Offer that has:
    instance fields :
            location, company, salary , isFullTime
    instance methods :
        setOfferInfo: can set the location, company, salary , isFullTime of the offer
        toString -- print all info about offers

     */

    String location;
    String company;
    double salary;
    boolean isFullTime;

    public void setInfo(String location, String company, double salary, boolean isFullTime){

        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime= isFullTime;

    }
    public String toString(){
        String salary = ""+this.salary;
        // String now can be manipulated
        return "Location: "+location+
                ", Company: "+company+
                ", Salary: $"+salary+
                ", Fulltime: "+isFullTime;

    }




}
