public class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.radius = 5.25;
        this.color = "green";
        this.filled = false;
    }

    public Circle(double r) {
        this.radius = r;
        this.color = "purple";
        this.filled = true;
    }

    public Circle(double r, String c, boolean f) {
        this.radius = r;
        this.color = c;
        this.filled = f;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.sqrt(this.radius);
    }

    @Override
    public String toString() {
        return "Shape: circle, radius: " + this.radius + ", color: " + this.color;
    }

}
