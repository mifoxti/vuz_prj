public abstract class Shape {
    protected String color;
    protected boolean filled;

//    Конструкторы абстрактного класса НЕ имеют смысла, т.к. мы НЕ можем создать объект абстрактного класса

    public Shape() {
        color = "blue";
        filled = true;
    }

    public Shape(String c, boolean f) {
        this.color = c;
        this.filled = f;
    }

//    Конец странного участка кода

    public String getColor() {
        return this.color;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean f){
        this.filled = f;
    };

    public abstract double getPerimeter();

    public abstract double getArea();

    @Override
    public String toString() {
        return this.color + " | filled = " + this.filled;
    }
}
