package day24_CustomMethods_Return;

public class BreakfastTasks {
    public static void main(String[] args) {
        initials("cydeo", "school");

        System.out.println("-----------------");

        domain("Cydeo.School@amazon.com");

        System.out.println("-----------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};
        for (String email : emails) {
            domain(email);
        }

        System.out.println("-----------------");

        nameOfMonth(11);

    }

    //Create a method that can display the initials of the person. initials(String firstName)
    public static void initials(String firstName, String lastName){
        String initials = firstName.charAt(0) + "." + lastName.charAt(0);
        initials = initials.toUpperCase();
        System.out.println("initial = " + initials);
    }

    //Create a method that can display the domain of the email. domain(String email)
    public static void domain(String email){ // Cydeo.School@gmail.com
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }

    //Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){
        String name = "";
        if (number >= 1 && number <= 12){
            name = (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr" :(number==5)?"May"
                    :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
                    :(number==11)?"Nov" : "Dec";
        }else{
            name = "Invalid";
        }

        System.out.println("Month name = " + name);

        }
    }



