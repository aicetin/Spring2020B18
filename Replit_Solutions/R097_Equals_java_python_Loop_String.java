package Replit_Solutions;
/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is
equal to the number of appearances of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
 */
import java.util.Scanner;
public class R097_Equals_java_python_Loop_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        //WRITE YOUR CODE HERE
        int countjava = 0;
        int countpython = 0;

        while (sentence.contains("java") || sentence.contains("python")){
            if(sentence.contains("java")){
                sentence = sentence.replaceFirst("java","");
                countjava++;
            }
            else if(sentence.contains("python")){
                sentence = sentence.replaceFirst("python", "");
                countpython++;
            }
        }
        if(countjava ==countpython){
            System.out.println(true);
            }
        else {
            System.out.println(false);
        }




    }
}
