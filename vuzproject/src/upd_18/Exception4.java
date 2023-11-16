package upd_18;

import java.util.Scanner;

public class Exception4 {
    private int a;
    public Exception4(int b)
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
        finally
        {
            System.out.println("Я огручик Риик!");
        }
    }

    public static void main(String[] args) {
        Exception4 object = new Exception4(2);
        object.exceptionDemo();
    }
}