package aaPractice;

public class RemoveDuplicatesChar {
    public static void main(String[] args) {

        String word = "AABBCCDD";
        String result = ""; // "ABC"

        for (int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
        if (result.contains("" + ch)){
            continue;
        }
            result += ch;

        }
        System.out.println(result);
    }
}
