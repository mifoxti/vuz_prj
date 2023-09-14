import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball filla = new Ball("filla", 700, true);
        filla.play();
        filla.showCoast();
        filla.burst();
        filla.play();
        
    }
}
