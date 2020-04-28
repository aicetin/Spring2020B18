package day21_MultiDimensionalArrays;
/*
2. write a program that can return the logest string of text from an array
	3. write a program that can return the shortest string of text from an array
 */
public class A03_Longest_Shortest_Words_WUT {
    public static void main(String[] args) {
        String[] names = {"Reem", "Omer", "Muhtar", "Emrah", "Mohammed", "Ana", "AAAAABBBBBBBBCCCCCC"};

        int maxLengthString = names[0].length(); //4
        int minLengthString = names[0].length();

        String longestWord = names[0];
        String shortestWord = names[0] ;

        for(int i = 0; i < names.length ; i++  ){

            if(names[i].length() > maxLengthString ){
                maxLengthString = names[i].length();
                longestWord = names[i];
            }

            if(names[i].length() < minLengthString){
                minLengthString = names[i].length();
                shortestWord = names[i];
            }

        }


        System.out.println(longestWord);
        System.out.println(shortestWord);

    }


}