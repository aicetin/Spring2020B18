package day23_methods;
// the method can not be declared in another method
public class C_02_Methods {
    // methods need to be inside class (within these { }) but outside our main method
    public static void main(String[] args) { // do not place a method inside this one
        // if we have to declare another method in this class--> outside this method
        // But we can call the method we created in here to be execute. Like this:
        printHello5Times(); // This will print : "Hello World" for 5 times
    }
    public static void printHello5Times(){ // this is our second method that we created in our class :  C_02_Methods
        for (int i = 0; i <5 ; i ++){
            System.out.println("Hello World"); // Now after we created this method we can call it in our main method
        }
    }
}
