package aaPractice;

public class CatDog {

    public static void main(String[] args) {

        System.out.println(catDogAppear("CAT dog cat dog"));

    }

    public static boolean catDogAppear(String str){

        str=str.toLowerCase();

        int count =0;
        int count1=0;

        while(str.contains("cat")){
            str=str.replaceFirst("cat","");
            count++;
        }
        while(str.contains("dog")){
            str=str.replaceFirst("dog","");
            count1++;
        }


        return count == count1;


    }
}
