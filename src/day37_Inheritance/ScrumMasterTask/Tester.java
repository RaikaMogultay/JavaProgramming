package day37_Inheritance.ScrumMasterTask;

public class Tester extends Employee{
    
    public Tester(String name, int age, char gender, int id, String jobTitle, double salary, String companyName) {
        super(name, age, gender, id, jobTitle, salary, companyName);
    }

    public void test(){
        System.out.println(name + " is testing in the code");
    }
}
