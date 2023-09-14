public class MovableRectangle implements Movable {
    private MovablePoint movablePoint;
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    int x1, x2, y1, y2;
    int xSpeed;
    int ySpeed;

    public MovableRectangle(int x, int y, int x2, int y2, int xSpeed, int ySpeed) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x2;
        this.y2 = y2;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovableRectangle: x: " + this.x1 + ", y: " + this.y1 + "x2: " + this.x2 + ", y2: " + this.y2 + ", xSpeed: " + this.xSpeed + ", ySpeed: " + this.ySpeed;
    }

    @Override
    public void moveUp() {
        this.y1 += 1;
        this.y2 += 1;
    }

    @Override
    public void moveDown() {
        this.y1 -= 1;
        this.y2 -= 1;
    }

    @Override
    public void moveLeft() {
        this.x1 -= 1;
        this.x2 -= 1;
    }

    @Override
    public void moveRight() {
        this.x1 += 1;
        this.x2 += 1;
    }
}
