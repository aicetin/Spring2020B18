package day11_Scanner;
import java.util.Scanner;

public class Scanner_Practice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = scan.nextInt();
        System.out.println("Enter number2:");
        int num2 = scan.nextInt();
        String result = (num1 > num2) ? "Enter number1: " : "Enter number2:";
        System.out.println(result);

        System.out.println("========================");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();

        System.out.println("===============================");



    }

}
