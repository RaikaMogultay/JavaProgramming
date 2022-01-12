package day33_Statics;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Erdogan");
        System.out.println(student1);

        Student student2 = new Student("Nurdan",'F');
        System.out.println(student2);

        Student student3 = new Student("Raika",12345);
        System.out.println(student3);

        Student student4 = new Student("Yasin",'M');
        System.out.println(student4);

        Student student5 = new Student("Arden",'M',0);
        System.out.println(student5);

        Student student6 = new Student("Cinar", 'M',10, 234);
        System.out.println(student6);

        Student student7 = new Student("Aysima", 'F', 14,345,'A');
        System.out.println(student7);

        System.out.println(student1 == student2);

        Student[] students={student1,student2,student3,student4,student5,student6,student7};
    }
}
