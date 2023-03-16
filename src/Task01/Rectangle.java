package Task01;

public class Rectangle {
    public Rectangle(float w, float h) {
        this.w = w;
        this.h = h;
    }

    float w, h;

    public float getArea() {
        return w * h;
    }
}
