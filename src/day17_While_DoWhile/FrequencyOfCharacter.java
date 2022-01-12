package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "AAABBBC";
        char ch = 'A';

        int frequency = 0; // 1+1+1

        for (int i = 0; i < str.length(); i++) { // i: indexes of str
            char eachChar = str.charAt(i); // eachChar: each character of str

            // 'A' == 'B'
            if (ch == eachChar) { // if given ch is matching with the eachChar, then ch is appeared in the string
                frequency++;
            }
        }

        System.out.println(frequency);
    }
}
