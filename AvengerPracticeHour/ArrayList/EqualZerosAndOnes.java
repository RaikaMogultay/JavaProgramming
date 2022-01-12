package ArrayList;

public class EqualZerosAndOnes {

    public static void main(String[] args) {
        int[] array = {1, 1, 1, 0, 1, 0};

        int countZeros = 0;
        int countOnes = 0;
        int moves;

        for (int i : array){
            if(i == 1){
                countOnes++;
            }else {
                countZeros++;
            }
        }
        System.out.println("countOnes = " + countOnes);
        System.out.println("countZeros = " + countZeros);

        if (countOnes<countZeros){
            moves=(countZeros-countOnes)/2;
        }else{
            moves=(countOnes-countZeros)/2;
        }
        System.out.println("moves = " + moves);


        System.out.println();





    }
}
