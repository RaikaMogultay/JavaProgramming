package aaPractice;

public class ReverseWords {

    public static void main(String[] args) {

        String array = "apple banana kiwi";

        String result = revWords(array);
        System.out.println(result);
    }

    public static String revWords(String str){
        StringBuilder reversedWords = new StringBuilder();

        // split input string by " " space to get each word as String[]
        String[] words = str.split(" ");

        //loop over the array from back
        for (int i = words.length-1; i >=0; i--){
            //add words to reverseWords with space
            reversedWords.append(words[i] + " ");
        }
        //trim needed to remove last space in the end
        return reversedWords.toString().trim();
    }
}
