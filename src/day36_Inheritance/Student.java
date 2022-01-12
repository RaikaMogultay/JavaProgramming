package day36_Inheritance;

public class Student {
    private String name, schoolName;
    private int age;
    private char gender, grade;

    public static boolean isStudent=true;
    public static boolean isHuman = true;

    public Student(String name, String schoolName, int age, char gender, char grade) {
        setName(name);
        setSchoolName(schoolName);
        setAge(age);
        setGender(gender);
        setGrade(grade);
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
       this.name = name;
    }
    public void setAge(int age){
        if(age<5 || age >90){
            return; // exits method
        }
        this.age=age;
    }

    public char getGender(){
        return gender;
    }

    public void setGender(char gender){
        if(!(gender == 'M' || gender == 'F')){
            return; // exits the method
        }
        this.gender=gender;
    }

    public char getGrade(){
        return grade;
    }
    public void setGrade(char grade){
        if( !( grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') ){
            return; // exits the method
        }
        this.grade=grade;
    }
    public String getSchoolName(){
        return schoolName;
    }
    public void setSchoolName(String schoolName){
        this.schoolName=schoolName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}
/*1. Create a class named Student:
			private variables:
				name, age, gender, grade, schoolName

			Encapsulate all the fileds (at least encapsulate two fields manually)
					requirments:
						1. age should not be set less than 5 or greater than 90
						2. gender should not be set to any chanarcter other than: 'M' and 'F'
						3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

			Add a constructor that can set all teh fields when the object is created
						(requirments of fileds in the above must be applied)


			Methods:
				study()
				toString()

 */
