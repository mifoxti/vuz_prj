public class Square extends Rectangle{
    public Square (){
        this.width = 10;
        this.length = this.width;
    }

    public Square (double s) {
        this.width = s;
        this.length = this.width;
    }

    public Square (double s, String c, boolean f) {
        this.width = s;
        this.length = this.width;
        this.color = c;
        this.filled = f;
    }

    public double getSide() {
        return this.length;
    }

    public void setSide(double s) {
        this.length = s;
        this.width = s;
    }

    @Override
    public void setWidth(double w) {
        this.width = w;
        this.length = w;
    }
    @Override
    public void setLength(double l) {
        this.width = l;
        this.length = l;
    }

    @Override
    public String toString(){
        return "Shape: Square, side: " + this.width + ", color: " + this.color;
    }
}
