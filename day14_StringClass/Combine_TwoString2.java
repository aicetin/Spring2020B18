package day14_StringClass;

import java.util.Scanner;

/*
2. Ask user to enter two words. Print first word without its first character,
    then print the second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana
 */
public class Combine_TwoString2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = input.nextLine();  // Apple
            word1 = word1.substring(1, word1.length());  //pple

        System.out.println("Enter second word");
        String word2 = input.nextLine();
            word2 = word2.substring(1, word2.length()); // anana

        String result = word1+word2;
        System.out.println(result);

        System.out.println("============================");

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter first word");
        String Word1 = input.nextLine();  // Apple
        Word1 = Word1.substring(1);  //pple

        System.out.println("Enter second word");
        String Word2 = input.nextLine();
        Word2 = Word2.substring(1); // anana

        String result2 = Word1+Word2;
        System.out.println(result2);




    }
}
