package day20_Arrays;

public class Count {

    public static void main(String[] args) {


        String str= "aabbbbcd";
        char[] arr= str.toCharArray(); //to create char Array from string

        String  result=" ";
        for (char each : arr) {
            int countOfElement=0;

            for(int i = 0; i <str.length();i++) {
                char ch = str.charAt(i);
                if (each == ch) {
                    countOfElement++;
                }
            }

                if (result.contains(each + "")) {
                    continue;

                }
                result += each;
                result += countOfElement;
            }


            System.out.print(result);
        }
    }

