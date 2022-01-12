package day11_Switch_Scanner;

public class Browers {
    public static void main(String[] args) {

        String browsername = "chrome";

        String result = "";

        boolean validBrowser = browsername =="chrome" || browsername == "firefox" || browsername == "opera" ||
                browsername == "safari" || browsername == "edge";

        if (validBrowser) {

            if (browsername == "chrome"){
                result = "Chrome Browser is selected";
            }else if (browsername == "firefox") {
                result = "firefox Browser is selected";
            }else if (browsername == "opera") {
                result ="opera Browser is selected";
            }else if ( browsername == "safari") {
                result = "Safari Browser is selected";
            }else {
                result= "Ege Browser is selected";
            }

        }else {
            result = "Invalid Browser Name";

        }
        System.out.println(result);

    }
}

/* 1. Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be:
        Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if

2. Write a program that can convert numbers 0~9 to words.

    NOTE: MUST use ternary
*/