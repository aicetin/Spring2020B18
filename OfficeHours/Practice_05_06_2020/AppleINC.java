package OfficeHours.Practice_05_06_2020;

public class AppleINC {

    public static void main(String[] args) {
        Tester tester1 = new Tester();
        tester1.setInfo("Onur", "Junior Tester", 75000, 12334);

        Tester tester2 = new Tester();
        tester2.setInfo("Ibrahim", "Junior Tester", 90000, 13425);

        Tester tester3 = new Tester();
        tester3.setInfo("Ali", "SDET", 80000, 6575);

        ScrumTeam scrum1 = new ScrumTeam(); // we can use the arraylist in scrumTeam class
        scrum1.hireATester(tester2);
        scrum1.hireATester(tester3);
        scrum1.hireATester(tester1);

        scrum1.fireATester(12334);

        // scrum1.testersTeam // returns the testersTeam arraylist from scrum1

        for( Tester each  : scrum1.testersTeam){  // prints out every single tester from scrumTeam
            System.out.println(each);
        }
        System.out.println("=============================================");
        Developer dev1 = new Developer();
        dev1.setInfo("Barzy", "Senior Developer", 110000, 54546);

        Developer dev2 = new Developer();
        dev2.setInfo("Oguz", "Usta Developer", 120000, 64646);

        scrum1.hireADeveloper(dev1);
        scrum1.hireADeveloper(dev2);

        scrum1.fireADeveloper(64646);



        System.out.println(scrum1.devpTeam.size());

        for(Developer each : scrum1.devpTeam){ // arraylist of developer in scrumTeam
            System.out.println(each);

            System.out.println("======================================");
            System.out.println("In my scrum Team, we have "+scrum1.testersTeam.size()+" testers and "+scrum1.devpTeam.size()+" developers");
    }

        /*
        create scrum2: 4 developers, 2 testers
        create scrum3: 5 developers, 3 testers

        create an array of scrum: {scrum1, scrum2,scrum3};
        1. iterator the array to print out all the testers who have salary > 120000
        2. print out all the developers who have salary < 120000

        create an Arraylist of scrum: {scrum1, scrum2, scrum3}
        1. remove all the testers who have salary < 100000
        2. remove all the testers who have salary < 120000


           NOTE: DO NOT create any ArrayList of Testers or Developers.
                Use the ArrayLists in ScrumTeam class only

         */




}
}
