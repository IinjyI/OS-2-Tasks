import Task01.Rectangle;
import Task02.BankAccount.Account;
import Task02.Circle.Circle;

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
    }
}