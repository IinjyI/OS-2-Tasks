import Task01.Rectangle;
import Task02.BankAccount.Account;
import Task02.Circle.Circle;
import Task02.Persons.Person;
import Task02.Persons.Student;
import Task02.Persons.Teacher;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2, 3);
        Rectangle rectangle2 = new Rectangle(5, 6);
        System.out.println("rectangle 1 area: " + rectangle1.getArea());
        System.out.println("rectangle 2 area: " + rectangle2.getArea());


        Circle circle1=new Circle(2,"blue");
        System.out.println("circle 1 area: " + circle1.getArea());
        circle1.setRadius(7);
        System.out.println("circle 1 area: " + circle1.getArea());


        Account account1=new Account("id001","Ada",1000);
        System.out.println(account1.ToString());

        Person person1=new Person("Ada","Cai");
        System.out.println(person1.ToString());
        person1.setAddress("Cairo");
        System.out.println(person1.ToString());


        Student student1=new Student("Ada", "Ger");
        System.out.println(student1.ToString());
        student1.addCourseGrade("Programming",95);
        student1.addCourseGrade("Maths",99);
        student1.printGrades();
        System.out.println("Average: "+student1.getAverageGrade());


        Teacher teacher1=new Teacher("Alan", "Ger");
        System.out.println(teacher1.addCourse("OS")); //true
        System.out.println(teacher1.addCourse("OS")); //false
        System.out.println(teacher1.removeCourse("AI")); //false
        System.out.println(teacher1.removeCourse("OS")); //true




    }
}