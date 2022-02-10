package aaPractice;

public class WithOutDivisionMutiMethod {

    public static void main(String[] args) {

        System.out.println(division(20,5));


    }
    public static int division(int a, int b){

        int count =0;

        while (a >=b){
            a-=b;
            count ++;
        }
        return count;

    }

    public static int multi(int x, int y){

        int multiply=0;

        for (int i=1; i<=x; i++){
            multiply +=y;
        }
        return multiply;
    }
}

/* I will assume that  'a'   is bigger than  'b'   so  i am going

   to take out   'b'  till     'a'    becames   same or smaller than   'b'  .
    And than will count it every time I removed     ' b '.
    So ,
   at the end  i was able to find how many  'b' do we have in   'a'  .

   and if anything remains , its going to be my  remainder

 */
