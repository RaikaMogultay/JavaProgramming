package aaPractice;

public class FindUnique {

    public static void main(String[] args) {

    }

    public static String unique(String str){

        String result="";

        for (int i=0; i<str.length(); i++){
            char unq=str.charAt(i);

            if (str.indexOf(unq) == str.lastIndexOf(unq)){
                result +=unq;
            }
        }

        return result;


    }
}
