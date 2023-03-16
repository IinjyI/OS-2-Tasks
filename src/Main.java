import Task01.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2, 3);
        Rectangle rectangle2 = new Rectangle(5, 6);
        System.out.println("rectangle 1 area: " + rectangle1.getArea());
        System.out.println("rectangle 2 area: " + rectangle2.getArea());
    }
}