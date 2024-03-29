package day16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbaacc";

        String result = ""; // abc
                     // i <= 7 ===> i < 8
        for (int i = 0; i <= str.length()-1; i++) { // i: represents the all the index numbers of str <start from 8>
            String ch = ""+str.charAt(i); // representes each character of str

            if( !result.contains(ch) ) { // if the character is not contained in the result
                result += ch;     // the character will be added to the result
            }
        }
        System.out.println(result);
    }
}

/*
2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC
				Output:
					ABC
			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding
 */

