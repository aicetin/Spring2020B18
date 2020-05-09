package OfficeHours.ExtraPractice_05_09_2020;
/*
Return the number of times that the string "hi" appears anywhere in the given string.

countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
 */
public class CountHiClass { public static void main(String[] args) {

    String str = "java cs java pro";
//        System.out.println(str.replace("java","c#"));
//        System.out.println(str.replaceFirst("java","#c"));
    int count = 0;
    while(str.contains("java")){
        count++;
        str = str.replaceFirst("java","");
        System.out.println(str);
    }
    System.out.println(count);


}


    public int countHi(String str) {
        int count = 0;
        for(int i=0; i < str.length()-1; i++) {

            String word = str.substring(i, i+2);

            if(word.equals("hi")) count++;

        }

        return count;

    }

}