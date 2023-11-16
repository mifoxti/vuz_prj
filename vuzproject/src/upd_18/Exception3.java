package upd_18;

import java.util.Scanner;

public class Exception3 {
    private int a;
    public Exception3(int b)
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
        catch(Exception e)
        {
            System.out.println("Ошибка");
        }
    }

    public static void main(String[] args) {
        Exception3 object = new Exception3(2);
        object.exceptionDemo();
    }
}