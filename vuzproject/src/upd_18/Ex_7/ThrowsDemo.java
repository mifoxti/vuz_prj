package upd_18.Ex_7;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        printDetails( key );
    }
    public void printDetails(String key) {
            String message = getDetails(key);
            System.out.println( message );
    }
    private String getDetails(String key) {
        try {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
            }
        } catch ( Exception e)
        {
            System.out.println("Ошибка");
            System.exit(1);
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo object = new ThrowsDemo();
        object.getDetails("1");
    }
}