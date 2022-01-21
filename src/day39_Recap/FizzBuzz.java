package day39_Recap;

public class FizzBuzz {
    public static void main(String[] args) {

        for(int i =1; i<=100; i++){
            if(i % 15==0){ // ilk once 15'den baslamamizin sebebi en buyuk bolen olmasidir..
                // if((i % 3 == 0) && (i %5 == 0))
                System.out.println("FizzBuzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}

/*Write a code or short program that prints each number from 1 to 100 on a new line.
For each multiple of 3, print “Fizz” instead of the number.
For each multiple of 5, print “Buzz” instead of the number.
For numbers which are multiple of both 3 and 5, print “FizzBuzz” instead of the number.

 */
