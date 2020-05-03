package CodingBat.String_1;

public class makeOutWord {
    public static void main(String[] args) {

        String out="<<<>>>";
        String word="word";

        makeOutWord(out,word);
        System.out.println(makeOutWord(out,word));


    }
    public static String makeOutWord(String out, String word){
        return out.substring(0,out.length()/2)+word+out.substring(out.length()/2);
    }


}
