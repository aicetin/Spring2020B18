package day07_IfStatements;

public class ValidTriangle_WUT {
/*
1. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
Write a program that declares three integers as angles and check whether a triangle is valid or not.
 */
public static void main(String[] args) {
    double angle1 = 30.5;
    double angle2 = 40;
    double angle3 = 60;

    short sumOfAngles = (short)(angle1 + angle1 +angle1);
    boolean validTriangle = sumOfAngles == 180;
    if(validTriangle){
        System.out.println("The shape is triangle");
    }
    if(!validTriangle){
        System.out.println("The shape is not a valid triangle");
    }



}
}
