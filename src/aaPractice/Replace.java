package aaPractice;

public class Replace {
    public static void main(String[] args) {

    }

    public static String replace(String str){

        str=str.toLowerCase();

        if (str.contains("x")){
            str =str.replace("x", "a");
        }

        return str;

    }
}
