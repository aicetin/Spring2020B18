package day21_MultiDimensionalArrays;

public class B03_Deneme {
    public static void main(String[] args) {
        String[] names = {"Reem", "Omer", "Muhtar", "Emrah", "Mohammed", "Ana", "AAAAABBBBBBBBCCCCCC"};

        int maxLengthString = names[0].length();
        int minLengthString = names[0].length();

        String longestWord = names[0];
        String shortestWord = names[0];

        for(int i = 0; i < names.length; i++){

            if(names[i].length()> maxLengthString){
                maxLengthString = names[i].length();
                longestWord = names[i];
            }
            if(names[i].length()< minLengthString){
                minLengthString = names[i].length();
                shortestWord = names[i];
            }
        }

        System.out.println(longestWord);
        System.out.println(shortestWord);

    }
}
