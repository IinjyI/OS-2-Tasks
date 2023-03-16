package Task02.Circle;

public class Circle {
    public Circle(){}
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }
    private double radius=1.0;
    String color ="red";

    public double getRadius() {
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

}
