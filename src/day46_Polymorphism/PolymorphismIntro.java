package day46_Polymorphism;

import day43_Abstraction.employeeTask.*;
import day45_Interface.shape.Circle;
import day45_Interface.shape.Square;

import java.util.ArrayList;

public class PolymorphismIntro {

    public static void main(String[] args) {

        String str = " Wooden Spoon";

        Integer n1 =2;

        Double n2 = 5.5;

        Boolean r1 = true;

        Object[] array = {str,n1,n2,r1, new Circle(4), new Square(7)};

           /*
            WebDriver driver;
            driver = new ChromeDriver();
            driver = new FireFoxDriver();
         */

        Employee tester = new Tester("Ali",30,'M',42,"SDET",145000.00);
        Employee developer = new Developer("Alex",28,'M',32,"Web Developer",155000.00);
        Employee teacher = new Teacher("Angel",28,'F',22,"English Teacher",85000.00);
        Employee driver = new Driver("Jhon",34,'M',42,"Lyft Driver",75000.00);

        ArrayList<Person> cydeoEmployees = new ArrayList();

        cydeoEmployees.add(tester);
        cydeoEmployees.add(developer);
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(driver);


        System.out.println("-------------------------------------------");







    }
}
