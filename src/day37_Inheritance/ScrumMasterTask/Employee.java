package day37_Inheritance.ScrumMasterTask;

public class Employee extends Person{

    public int id;
    public String jobTitle;
    public double salary;
    public String companyName;



    public Employee(String name, int age, char gender, int id, String jobTitle, double salary, String companyName) {
        super(name, age, gender);
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.companyName=companyName;
    }

    public void work(){
        System.out.println(jobTitle + " " + name + " is working");
    }


    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", company name =" + companyName +
                '}';
    }
}
