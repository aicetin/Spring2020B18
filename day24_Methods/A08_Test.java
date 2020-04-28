package day24_Methods;
import Resources.Library;
import java.util.Arrays;
public class A08_Test {
    // MAIN PURPOSE OF HAVING STATIC AS SPECIFIER IS TO BE ABLE TO CALL METHODS FROM OTHER CLASSES THAT ARE IN THE SAME PACKAGE
    // IF WE NEED TO USE A METHOD LOCATED IN A CLASS WHICH IS NOT IN THE SAME PACKAGE LIKE HERE WE NEED TO IMPORT THE CLASS
    // TO IMPORT : import packageName.className;

    public static void main(String[] args) {
        String str = "Muhtar";
        // Since our method's specifier is "static" then we can call a method from another class
        // we call by : classname.method's name
        // Then assign to the right data type

        String RevStr = Library.Reverse(str);

        System.out.println(RevStr);

        int[] arr = {5,9,10, 3, 2,-1};
        // in order to sort in descending order we can call the descedning method from the other class
        // (where we created it)

        arr = Library.sortDesending( arr );

        System.out.println(Arrays.toString(arr) );





    }

}