package upd_18;

import java.util.Scanner;

public class Exception2 {
    private int a;
    public Exception2(int b)
    {
        a = b;
    }
    public void exceptionDemo() {
        int answer = 0;
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            answer = 2 / i;
        }
        catch(NumberFormatException e)
        {
            System.out.println("Попытка сделать String int'ом");
        }
        catch (Exception InterruptedException)
        {
            System.out.println("Деление на 0");
        }
    }

    public static void main(String[] args) {
        Exception2 object = new Exception2(2);
        object.exceptionDemo();
    }
}