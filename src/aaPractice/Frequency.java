package aaPractice;

public class Frequency {

    public static void main(String[] args) {

       frequency("abcddccccc", 'c');

    }

    public static int frequency(String str, char ch){

        int count =0;

        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
