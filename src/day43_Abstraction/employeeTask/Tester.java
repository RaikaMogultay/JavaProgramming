package day43_Abstraction.employeeTask;

public class Tester extends Employee{


    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {

    }

    @Override
    public void sleep() {

    }

    public void bugReport(){
        System.out.println(getName()+" is creating bug reports");
    }
}
