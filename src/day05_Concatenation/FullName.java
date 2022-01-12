package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String firsName = "Raika";
        String lastName = "Mogultay";
        int age = 25;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firsName + " " + lastName;

        // Full name of the person is .....
        System.out.println("Full name of the person is " + fullName);

        // .... is .. years old.
        System.out.println( fullName + " is " + age + " years old." );

        //Fullname is JobTitle, works at CompanyName
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName + ", and "+ fullName + " salary is " + salary);

    }
}
