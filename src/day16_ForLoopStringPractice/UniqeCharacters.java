package day16_ForLoopStringPractice;

public class UniqeCharacters {
    public static void main(String[] args) {
        String str = "aaabcc";

        String result = "";

        for (int i =0; i <= str.length(); i++){ // i> index numbers of str( starting from 0)

          char ch = str.charAt(i); // ch: each characters of str
            if (str.indexOf('a') == str.lastIndexOf('a')) { // if the first and last index numbers are same, then the character uniq
                result += 'a';
        }


        }
    }
}
