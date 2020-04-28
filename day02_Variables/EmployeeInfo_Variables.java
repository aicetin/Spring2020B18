package day02_Variables;

public class EmployeeInfo_Variables {
    /*
create a class called EmployeeInfo_Variables:
            print:
                your company's name
                your name
                your EmployeeId
                your JobTitle
                your Salary
                SSN

    */

    public static void main(String[] args) {

    String employeeName = "Fatih";
    String companyName = "Oracle";
    int employeeId = 9;
    String jobTitle = "SDET";
    double salary = 100000.5;
    long ssn = 123456789;

    // employeeName: Andrea

        /*
        System.out.println("employeeName: "+employeeName);
        System.out.println("CompanyName: "+companyName );
        System.out.println("EmployeeId: "+employeeId);
        System.out.println("JobTitle: "+jobTitle);
        System.out.println("Salary: "+salary);
        System.out.println("SSN: "+ssn);

         */
        System.out.println("employeeName: "+employeeName+"\nCompanyName: "+companyName+"\nEmployeeId: "+employeeId+"\nJobTitle: "+jobTitle+"\nSalary: "+salary+"\nSSN: "+ssn);

        System.out.println("=============================================");

        String firstName = "Zeynep";
        String lastName = "Dere";
          // full Name: Zeynep Dere


        System.out.println("Full Name: "+firstName+" "+lastName);

        System.out.println(11 + 10); // addition
        System.out.println("11" + "10"); // concatenation



        }
}
