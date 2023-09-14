public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this.width = 5.3;
        this.length = 2.3;
    }

    public Rectangle(double w, double l) {
        this.width = w;
        this.length = l;
    }

    public Rectangle(double w, double l, String c, boolean f) {
        this.width = w;
        this.length = l;
        this.color = c;
        this.filled = f;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    public void setLength(double l) {
        this.length = l;
    }

    @Override
    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return "Shape: rectangle, width: " + this.width + " , length: " + this.length + ", color: " + this.color;
    }
}
