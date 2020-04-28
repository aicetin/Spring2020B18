package day03_VariablesContinue;

public class SalaryCalculator {

    public static void main(String[] args) {
        // DataType variableName = Data;
        double hourlyRate = 65;
        double stateTaxRate = 0.04;
        double federalTaxRate =0.22;
        byte weeklyHours = 45;
        byte totalWeeks = 48;

        // salary = hourlyRate * weeklyHours * totalWeeks;
        double salary = hourlyRate * weeklyHours * totalWeeks;
        // total salary before the tax
        // stateTax = salary * stateTaxRate
        double stateTax = salary * stateTaxRate;
        // federalTax = salary * federalTaxRate
        double federalTax = salary * federalTaxRate;

        // totalTax = stateTax + federalTax ;
        double totalTax = stateTax + federalTax ;

        // salaryAfterTax = salary - totalTax ;
        double salaryAfterTax = salary - totalTax ;

        System.out.println("Your salary is: $" + salary); // concatenation
        System.out.println("State tax is: $" + stateTax); // concatenation
        System.out.println("Federal Tax is: $" + federalTax);
        System.out.println("Total Tax is: $" + totalTax );
        System.out.println("Salary After Tax is: $" + salaryAfterTax);


        System.out.println("9" + 3); // 93, concatenation
        System.out.println( 9+ "3"); // 93, concatenation
        System.out.println(9 +3 ); // 12, addition




    }



}
