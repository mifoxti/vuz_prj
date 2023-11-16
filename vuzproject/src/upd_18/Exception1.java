package upd_18;

public class Exception1
{
    private int a = 0;
    public Exception1(int b)
    {
        a = b;
    }
    public void exceptionDemo() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }

    }

    public static void main(String[] args) {
        Exception1 object = new Exception1(1);
        object.exceptionDemo();
    }
}
