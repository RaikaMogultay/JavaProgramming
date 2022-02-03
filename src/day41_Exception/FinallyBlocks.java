package day41_Exception;

public class FinallyBlocks {
    public static void main(String[] args) {

        int[] arr = {1,2,3};

        try {
            System.out.println(arr[10]);
            System.out.println("Try Block");
        }catch (RuntimeException e){
            System.out.println("Catch Block");
            e.printStackTrace();
            System.exit(0);
        }finally {
            System.out.println("Finally Block");
        }


    }
}
