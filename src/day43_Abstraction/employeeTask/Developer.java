package day43_Abstraction.employeeTask;

public class Developer extends Employee {


    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {

    }

    @Override
    public void sleep() {

    }

    public void unitTest(){
        System.out.println(getName()+" is unit testing");
    }
}
