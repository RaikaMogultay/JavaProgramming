package aaPractice;

public class ReverseEachStringArray {

    public static void main(String[] args) {

        String[] names = {"java", "python", "c#"};

        for (String each : names){
           String reserved = "";

           for (int i = each.length()-1; i>=0; i--){
               reserved += each.charAt(i);
           }

            System.out.println(reserved);
        }


    }
}

/*Create string array, and store the names of your group persons
            reverse each students names and print them in separate lines use custom method
                ex:
                    arr = {java, python, c#}

                output:
                    avaJ
                    nohtyp
                    #c

 */
